
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNNtlConsentSpec.h"

@interface NtlConsent : NSObject <NativeNtlConsentSpec>
#else
#import <React/RCTBridgeModule.h>

@interface NtlConsent : NSObject <RCTBridgeModule>
#endif

@end
