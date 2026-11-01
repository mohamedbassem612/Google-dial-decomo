package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class yoa {
    public static defpackage.yoa i(com.google.android.apps.aicore.aidl.FunctionArgsValue functionArgsValue) {
        defpackage.yoa yntVar;
        int i = functionArgsValue.b;
        switch (i) {
            case 0:
                java.lang.String str = functionArgsValue.c;
                j$.util.Objects.requireNonNull(str);
                return new defpackage.yny(str);
            case 1:
                return new defpackage.yns(functionArgsValue.d);
            case 2:
                return new defpackage.ynu(functionArgsValue.e);
            case 3:
                yntVar = new defpackage.ynt(functionArgsValue.f);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                aift aiftVar = new aift(4);
                aify aifyVar = functionArgsValue.g;
                int size = aifyVar.size();
                for (int i2 = 0; i2 < size; i2++) {
                    aiftVar.i(i((com.google.android.apps.aicore.aidl.FunctionArgsValue) aifyVar.get(i2)));
                }
                aify aifyVarN = aify.n(aiftVar.h());
                j$.util.Objects.requireNonNull(aifyVarN);
                return new defpackage.ynv(aifyVarN);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                yntVar = new defpackage.ynw(functionArgsValue.h);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aigb aigbVar = new aigb(4);
                aigf aigfVarA = functionArgsValue.a();
                if (aigfVarA != null) {
                    ailj ailjVarK = aigfVarA.e().k();
                    while (ailjVarK.hasNext()) {
                        java.util.Map.Entry entry = (java.util.Map.Entry) ailjVarK.next();
                        aigbVar.i((java.lang.String) entry.getKey(), i((com.google.android.apps.aicore.aidl.FunctionArgsValue) entry.getValue()));
                    }
                }
                aigf aigfVarI = aigf.i(aigbVar.e(true));
                j$.util.Objects.requireNonNull(aigfVarI);
                return new defpackage.ynx(aigfVarI);
            default:
                throw new java.lang.IllegalArgumentException(a.bj(i, "Unsupported value kind: "));
        }
        return yntVar;
    }

    public abstract boolean a();

    public abstract int b();

    public abstract double c();

    public abstract int d();

    public abstract aify e();

    public abstract long f();

    public abstract aigf g();

    public abstract java.lang.String h();
}
