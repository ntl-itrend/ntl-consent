import { NativeModules, Platform } from 'react-native';

const LINKING_ERROR =
  `The package '@react-native-firebase/ntl-consent' doesn't seem to be linked. Make sure: \n\n` +
  Platform.select({ ios: "- You have run 'pod install'\n", default: '' }) +
  '- You rebuilt the app after installing the package\n' +
  '- You are not using Expo Go\n';

// @ts-expect-error
const isTurboModuleEnabled = global.__turboModuleProxy != null;

const NtlConsentModule = isTurboModuleEnabled
  ? require('./NativeNtlConsent').default
  : NativeModules.NtlConsent;

const NtlConsent = NtlConsentModule
  ? NtlConsentModule
  : new Proxy(
      {},
      {
        get() {
          throw new Error(LINKING_ERROR);
        },
      }
    );

export function multiply(a: number, b: number): Promise<number> {
  return NtlConsent.multiply(a, b);
}
