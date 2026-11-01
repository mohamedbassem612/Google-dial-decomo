package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aajs extends defpackage.aagp {
    public aajs(android.content.Context context, android.os.Looper looper, defpackage.aaei aaeiVar, defpackage.aafi aafiVar) {
        defpackage.aadb aadbVar = new defpackage.aadb(context);
        defpackage.aatt aattVar = defpackage.aatt.a;
        java.util.Map map = aadbVar.e;
        defpackage.acxg acxgVar = defpackage.aats.a;
        super(context, looper, 25, new defpackage.aagi(null, aadbVar.a, aadbVar.d, aadbVar.b, aadbVar.c, map.containsKey(acxgVar) ? (defpackage.aatt) aadbVar.e.get(acxgVar) : aattVar), aaeiVar, aafiVar);
    }

    @Override // defpackage.aagp, defpackage.aagf, defpackage.aacv
    public final int a() {
        return 12800000;
    }

    @Override // defpackage.aagf
    protected final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        aajb aajbVarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.droidguard.internal.IDroidGuardService");
        return aajbVarQueryLocalInterface instanceof aajb ? aajbVarQueryLocalInterface : new aajb(iBinder);
    }

    @Override // defpackage.aagf
    protected final java.lang.String c() {
        return "com.google.android.gms.droidguard.internal.IDroidGuardService";
    }

    @Override // defpackage.aagf
    protected final java.lang.String d() {
        return "com.google.android.gms.droidguard.service.START";
    }
}
