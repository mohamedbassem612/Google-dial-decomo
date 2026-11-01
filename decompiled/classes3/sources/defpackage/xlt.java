package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class xlt extends ylc implements defpackage.xlu {
    public xlt() {
        super("com.android.onboarding.tasks.IOnboardingTaskManagerService");
    }

    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        defpackage.xoc xoaVar;
        defpackage.xoc xoaVar2;
        defpackage.xoc xoaVar3;
        defpackage.xoc xoaVar4;
        defpackage.xoc xoaVar5;
        defpackage.xoc xoaVar6;
        defpackage.xoc xoaVar7;
        defpackage.xoc xoaVar8;
        defpackage.xoc xoaVar9;
        defpackage.xlw xlvVar = null;
        defpackage.xod xodVar = null;
        defpackage.xoe xoeVar = null;
        defpackage.xnx xnwVar = null;
        defpackage.xod xodVar2 = null;
        defpackage.xnx xnwVar2 = null;
        defpackage.xod xodVar3 = null;
        defpackage.xoe xoeVar2 = null;
        defpackage.xls xlsVar = null;
        defpackage.xlw xlvVar2 = null;
        switch (i) {
            case 1:
                com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken = (com.android.onboarding.tasks.ErasedOnboardingTaskToken) yld.a(parcel, com.android.onboarding.tasks.ErasedOnboardingTaskToken.CREATOR);
                android.os.PersistableBundle persistableBundle = (android.os.PersistableBundle) yld.a(parcel, android.os.PersistableBundle.CREATOR);
                yld.c(parcel);
                boolean zS = s(erasedOnboardingTaskToken, persistableBundle);
                parcel2.writeNoException();
                parcel2.writeInt(zS ? 1 : 0);
                return true;
            case 2:
                com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken2 = (com.android.onboarding.tasks.ErasedOnboardingTaskToken) yld.a(parcel, com.android.onboarding.tasks.ErasedOnboardingTaskToken.CREATOR);
                yld.c(parcel);
                com.android.onboarding.tasks.ErasedOnboardingTaskState erasedOnboardingTaskStateF = f(erasedOnboardingTaskToken2);
                parcel2.writeNoException();
                yld.e(parcel2, erasedOnboardingTaskStateF);
                return true;
            case 3:
                com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken3 = (com.android.onboarding.tasks.ErasedOnboardingTaskToken) yld.a(parcel, com.android.onboarding.tasks.ErasedOnboardingTaskToken.CREATOR);
                yld.c(parcel);
                android.os.PersistableBundle persistableBundleD = d(erasedOnboardingTaskToken3);
                parcel2.writeNoException();
                yld.e(parcel2, persistableBundleD);
                return true;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken4 = (com.android.onboarding.tasks.ErasedOnboardingTaskToken) yld.a(parcel, com.android.onboarding.tasks.ErasedOnboardingTaskToken.CREATOR);
                android.os.PersistableBundle persistableBundle2 = (android.os.PersistableBundle) yld.a(parcel, android.os.PersistableBundle.CREATOR);
                yld.c(parcel);
                p(erasedOnboardingTaskToken4, persistableBundle2);
                parcel2.writeNoException();
                return true;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken5 = (com.android.onboarding.tasks.ErasedOnboardingTaskToken) yld.a(parcel, com.android.onboarding.tasks.ErasedOnboardingTaskToken.CREATOR);
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.android.onboarding.tasks.IOnboardingTaskManagerServiceListener");
                    xlvVar = iInterfaceQueryLocalInterface instanceof defpackage.xlw ? (defpackage.xlw) iInterfaceQueryLocalInterface : new defpackage.xlv(strongBinder);
                }
                yld.c(parcel);
                r(erasedOnboardingTaskToken5, xlvVar);
                parcel2.writeNoException();
                return true;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken6 = (com.android.onboarding.tasks.ErasedOnboardingTaskToken) yld.a(parcel, com.android.onboarding.tasks.ErasedOnboardingTaskToken.CREATOR);
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.android.onboarding.tasks.IOnboardingTaskManagerServiceListener");
                    xlvVar2 = iInterfaceQueryLocalInterface2 instanceof defpackage.xlw ? (defpackage.xlw) iInterfaceQueryLocalInterface2 : new defpackage.xlv(strongBinder2);
                }
                yld.c(parcel);
                q(erasedOnboardingTaskToken6, xlvVar2);
                parcel2.writeNoException();
                return true;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken7 = (com.android.onboarding.tasks.ErasedOnboardingTaskToken) yld.a(parcel, com.android.onboarding.tasks.ErasedOnboardingTaskToken.CREATOR);
                int i2 = parcel.readInt();
                byte[] bArrCreateByteArray = parcel.createByteArray();
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                parcel.readInt();
                yld.c(parcel);
                boolean zW = w(erasedOnboardingTaskToken7, i2, bArrCreateByteArray, i3, i4);
                parcel2.writeNoException();
                parcel2.writeInt(zW ? 1 : 0);
                return true;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken8 = (com.android.onboarding.tasks.ErasedOnboardingTaskToken) yld.a(parcel, com.android.onboarding.tasks.ErasedOnboardingTaskToken.CREATOR);
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                int i7 = parcel.readInt();
                parcel.readInt();
                yld.c(parcel);
                byte[] bArrT = t(erasedOnboardingTaskToken8, i5, i6, i7);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrT);
                return true;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken9 = (com.android.onboarding.tasks.ErasedOnboardingTaskToken) yld.a(parcel, com.android.onboarding.tasks.ErasedOnboardingTaskToken.CREATOR);
                android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.android.onboarding.tasks.IGetTaskStateListener");
                    xlsVar = iInterfaceQueryLocalInterface3 instanceof defpackage.xls ? (defpackage.xls) iInterfaceQueryLocalInterface3 : new defpackage.xls(strongBinder3);
                }
                yld.c(parcel);
                B(erasedOnboardingTaskToken9, xlsVar);
                parcel2.writeNoException();
                return true;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                int iA = a();
                parcel2.writeNoException();
                parcel2.writeInt(iA);
                return true;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                android.os.IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    xoaVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.android.onboarding.tasks.service.IPersistableBundleStream");
                    xoaVar = iInterfaceQueryLocalInterface4 instanceof defpackage.xoc ? (defpackage.xoc) iInterfaceQueryLocalInterface4 : new defpackage.xoa(strongBinder4);
                }
                android.os.IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 == null) {
                    xoaVar2 = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.android.onboarding.tasks.service.IPersistableBundleStream");
                    xoaVar2 = iInterfaceQueryLocalInterface5 instanceof defpackage.xoc ? (defpackage.xoc) iInterfaceQueryLocalInterface5 : new defpackage.xoa(strongBinder5);
                }
                android.os.IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.android.onboarding.tasks.service.IUnitCallback");
                    xoeVar2 = iInterfaceQueryLocalInterface6 instanceof defpackage.xoe ? (defpackage.xoe) iInterfaceQueryLocalInterface6 : new defpackage.xoe(strongBinder6);
                }
                yld.c(parcel);
                D(xoaVar, xoaVar2, xoeVar2);
                return true;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                android.os.IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 == null) {
                    xoaVar3 = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.android.onboarding.tasks.service.IPersistableBundleStream");
                    xoaVar3 = iInterfaceQueryLocalInterface7 instanceof defpackage.xoc ? (defpackage.xoc) iInterfaceQueryLocalInterface7 : new defpackage.xoa(strongBinder7);
                }
                android.os.IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.android.onboarding.tasks.service.IResultCallback");
                    xodVar3 = iInterfaceQueryLocalInterface8 instanceof defpackage.xod ? (defpackage.xod) iInterfaceQueryLocalInterface8 : new defpackage.xod(strongBinder8);
                }
                yld.c(parcel);
                A(xoaVar3, xodVar3);
                return true;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                android.os.IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 == null) {
                    xoaVar4 = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.android.onboarding.tasks.service.IPersistableBundleStream");
                    xoaVar4 = iInterfaceQueryLocalInterface9 instanceof defpackage.xoc ? (defpackage.xoc) iInterfaceQueryLocalInterface9 : new defpackage.xoa(strongBinder9);
                }
                android.os.IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.android.onboarding.tasks.service.IObserver");
                    xnwVar2 = iInterfaceQueryLocalInterface10 instanceof defpackage.xnx ? (defpackage.xnx) iInterfaceQueryLocalInterface10 : new defpackage.xnw(strongBinder10);
                }
                yld.c(parcel);
                defpackage.xnz xnzVarJ = j(xoaVar4, xnwVar2);
                parcel2.writeNoException();
                yld.f(parcel2, xnzVarJ);
                return true;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                android.os.IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 == null) {
                    xoaVar5 = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.android.onboarding.tasks.service.IPersistableBundleStream");
                    xoaVar5 = iInterfaceQueryLocalInterface11 instanceof defpackage.xoc ? (defpackage.xoc) iInterfaceQueryLocalInterface11 : new defpackage.xoa(strongBinder11);
                }
                android.os.IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.android.onboarding.tasks.service.IResultCallback");
                    xodVar2 = iInterfaceQueryLocalInterface12 instanceof defpackage.xod ? (defpackage.xod) iInterfaceQueryLocalInterface12 : new defpackage.xod(strongBinder12);
                }
                yld.c(parcel);
                z(xoaVar5, xodVar2);
                return true;
            case 15:
                android.os.IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 == null) {
                    xoaVar6 = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.android.onboarding.tasks.service.IPersistableBundleStream");
                    xoaVar6 = iInterfaceQueryLocalInterface13 instanceof defpackage.xoc ? (defpackage.xoc) iInterfaceQueryLocalInterface13 : new defpackage.xoa(strongBinder13);
                }
                android.os.IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.android.onboarding.tasks.service.IObserver");
                    xnwVar = iInterfaceQueryLocalInterface14 instanceof defpackage.xnx ? (defpackage.xnx) iInterfaceQueryLocalInterface14 : new defpackage.xnw(strongBinder14);
                }
                yld.c(parcel);
                defpackage.xnz xnzVarI = i(xoaVar6, xnwVar);
                parcel2.writeNoException();
                yld.f(parcel2, xnzVarI);
                return true;
            case 16:
                android.os.IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 == null) {
                    xoaVar7 = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.android.onboarding.tasks.service.IPersistableBundleStream");
                    xoaVar7 = iInterfaceQueryLocalInterface15 instanceof defpackage.xoc ? (defpackage.xoc) iInterfaceQueryLocalInterface15 : new defpackage.xoa(strongBinder15);
                }
                android.os.IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 == null) {
                    xoaVar8 = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.android.onboarding.tasks.service.IPersistableBundleStream");
                    xoaVar8 = iInterfaceQueryLocalInterface16 instanceof defpackage.xoc ? (defpackage.xoc) iInterfaceQueryLocalInterface16 : new defpackage.xoa(strongBinder16);
                }
                android.os.IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.android.onboarding.tasks.service.IUnitCallback");
                    xoeVar = iInterfaceQueryLocalInterface17 instanceof defpackage.xoe ? (defpackage.xoe) iInterfaceQueryLocalInterface17 : new defpackage.xoe(strongBinder17);
                }
                yld.c(parcel);
                C(xoaVar7, xoaVar8, xoeVar);
                return true;
            case 17:
                android.os.IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 == null) {
                    xoaVar9 = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.android.onboarding.tasks.service.IPersistableBundleStream");
                    xoaVar9 = iInterfaceQueryLocalInterface18 instanceof defpackage.xoc ? (defpackage.xoc) iInterfaceQueryLocalInterface18 : new defpackage.xoa(strongBinder18);
                }
                android.os.IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.android.onboarding.tasks.service.IResultCallback");
                    xodVar = iInterfaceQueryLocalInterface19 instanceof defpackage.xod ? (defpackage.xod) iInterfaceQueryLocalInterface19 : new defpackage.xod(strongBinder19);
                }
                yld.c(parcel);
                y(xoaVar9, xodVar);
                return true;
            default:
                return false;
        }
    }
}
