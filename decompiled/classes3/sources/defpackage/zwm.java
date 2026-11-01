package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class zwm implements zwp {
    public final /* synthetic */ android.accounts.Account a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ android.os.Bundle c;
    public final /* synthetic */ android.content.Context d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ aogc g;

    public /* synthetic */ zwm(android.accounts.Account account, java.lang.String str, android.os.Bundle bundle, android.content.Context context, aogc aogcVar, long j, long j2) {
        this.a = account;
        this.b = str;
        this.c = bundle;
        this.d = context;
        this.g = aogcVar;
        this.e = j;
        this.f = j2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: zwj */
    public final java.lang.Object a(android.os.IBinder iBinder) throws java.io.IOException, zwj {
        ylb yruVar;
        java.lang.String strAA;
        java.lang.String[] strArr = zwq.b;
        com.google.android.gms.auth.TokenData tokenData = null;
        if (iBinder == null) {
            yruVar = null;
        } else {
            ylb ylbVarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            yruVar = ylbVarQueryLocalInterface instanceof yru ? (yru) ylbVarQueryLocalInterface : new yru(iBinder);
        }
        android.os.Bundle bundle = this.c;
        java.lang.String str = this.b;
        android.accounts.Account account = this.a;
        android.os.Parcel parcelEP = yruVar.eP();
        yld.d(parcelEP, account);
        parcelEP.writeString(str);
        yld.d(parcelEP, bundle);
        android.os.Parcel parcelEQ = yruVar.eQ(5, parcelEP);
        android.os.Bundle bundle2 = (android.os.Bundle) yld.a(parcelEQ, android.os.Bundle.CREATOR);
        parcelEQ.recycle();
        if (bundle2 == null) {
            throw new java.io.IOException("Service call returned null");
        }
        java.lang.ClassLoader classLoader = com.google.android.gms.auth.TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle2.setClassLoader(classLoader);
        }
        android.os.Bundle bundle3 = bundle2.getBundle("tokenDetails");
        if (bundle3 != null) {
            if (classLoader != null) {
                bundle3.setClassLoader(classLoader);
            }
            tokenData = (com.google.android.gms.auth.TokenData) dpe.t(bundle3, "TokenData", com.google.android.gms.auth.TokenData.class);
        }
        long j = this.f;
        long j2 = this.e;
        aogc aogcVar = this.g;
        if (tokenData != null) {
            aogcVar.al(1709, 0, j2, java.lang.System.currentTimeMillis(), j);
            return tokenData;
        }
        java.lang.String string = bundle2.getString("Error");
        android.content.Intent intent = (android.content.Intent) dpe.t(bundle2, "userRecoveryIntent", android.content.Intent.class);
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) dpe.t(bundle2, "userRecoveryPendingIntent", android.app.PendingIntent.class);
        int i = 49500;
        while (i < 50000) {
            if (i != 495243) {
                switch (i) {
                    case 49500:
                        strAA = "AccountNotPresent";
                        break;
                    case 49501:
                        strAA = "AppSuspended";
                        break;
                    case 49502:
                        strAA = "InvalidScope";
                        break;
                    case 49503:
                        strAA = "NeedPermission";
                        break;
                    case 49504:
                        strAA = "NeedRemoteConsent";
                        break;
                    case 49505:
                        strAA = "PermissionDenied";
                        break;
                    case 49506:
                        strAA = "UnknownError";
                        break;
                    default:
                        switch (i) {
                            case 49508:
                                strAA = "ServiceUnavailable";
                                break;
                            case 49509:
                                strAA = "InvalidRequest";
                                break;
                            case 49510:
                                strAA = "EmptyConsumerPackageOrSignature";
                                break;
                            case 49511:
                                strAA = "NeedsTwoFactorAuth";
                                break;
                            case 49512:
                                strAA = "NeedsBrowser";
                                break;
                            default:
                                switch (i) {
                                    case 49514:
                                        strAA = "UserCancel";
                                        break;
                                    case 49515:
                                        strAA = "RestrictedClient";
                                        break;
                                    case 49516:
                                        strAA = "InvalidAudience";
                                        break;
                                    case 49517:
                                        strAA = "UnregisteredOnApiConsole";
                                        break;
                                    case 49518:
                                        strAA = "ThirdPartyDeviceManagementRequired";
                                        break;
                                    case 49519:
                                        strAA = "DeviceManagementInternalError";
                                        break;
                                    case 49520:
                                        strAA = "DeviceManagementSyncDisabled";
                                        break;
                                    case 49521:
                                        strAA = "DeviceManagementAdminBlocked";
                                        break;
                                    case 49522:
                                        strAA = "DeviceManagementAdminPendingApproval";
                                        break;
                                    default:
                                        switch (i) {
                                            case 49524:
                                                strAA = "DeviceManagementDeactivated";
                                                break;
                                            case 49525:
                                                strAA = "DeviceManagementScreenLockRequired";
                                                break;
                                            case 49526:
                                                strAA = "DeviceManagementRequired";
                                                break;
                                            case 49527:
                                                strAA = "DeviceManagementRequiredOrSyncDisabled";
                                                break;
                                            case 49528:
                                                strAA = "AuthSecurityError";
                                                break;
                                            case 49529:
                                                strAA = "AuthBindingError";
                                                break;
                                            case 49530:
                                                strAA = "BadAuthentication";
                                                break;
                                            case 49531:
                                                strAA = "NetworkError";
                                                break;
                                            default:
                                                switch (i) {
                                                    case 49754:
                                                        strAA = "CapabilityResponseYes";
                                                        break;
                                                    case 49755:
                                                        strAA = "CapabilityResponseNo";
                                                        break;
                                                    case 49756:
                                                        strAA = "CapabilityResponseNotPermitted";
                                                        break;
                                                    case 49757:
                                                        strAA = "CapabilityResponseRequestFailed";
                                                        break;
                                                    case 49758:
                                                        strAA = "CapabilityResponseUnknownCapability";
                                                        break;
                                                    case 49759:
                                                        strAA = "CapabilityResponseFailedToSync";
                                                        break;
                                                    default:
                                                        strAA = aais.aA(i);
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                strAA = "DeviceManagementStaleSyncRequired";
            }
            if (strAA.equals(string)) {
                android.content.Context context = this.d;
                aogcVar.al(1709, i, j2, java.lang.System.currentTimeMillis(), j);
                zwq.g(context, "getTokenWithDetails", string, intent, pendingIntent);
                throw new zwj("Invalid state. Shouldn't happen");
            }
            i++;
        }
        i = 13;
        android.content.Context context2 = this.d;
        aogcVar.al(1709, i, j2, java.lang.System.currentTimeMillis(), j);
        zwq.g(context2, "getTokenWithDetails", string, intent, pendingIntent);
        throw new zwj("Invalid state. Shouldn't happen");
    }
}
