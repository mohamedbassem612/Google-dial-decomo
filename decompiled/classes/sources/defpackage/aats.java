package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aats {
    public static final defpackage.acxg a;
    public static final defpackage.aais b;
    static final defpackage.aais c;
    public static final defpackage.aais d;
    public static final defpackage.aais e;

    static {
        defpackage.aais aaisVar = new defpackage.aais();
        d = aaisVar;
        defpackage.aais aaisVar2 = new defpackage.aais();
        e = aaisVar2;
        defpackage.aatp aatpVar = new defpackage.aatp();
        b = aatpVar;
        defpackage.aatq aatqVar = new defpackage.aatq();
        c = aatqVar;
        new com.google.android.gms.common.api.Scope(1, "profile");
        new com.google.android.gms.common.api.Scope(1, "email");
        a = new defpackage.acxg("SignIn.API", aatpVar, aaisVar);
        new defpackage.acxg("SignIn.INTERNAL_API", aatqVar, aaisVar2);
    }
}
