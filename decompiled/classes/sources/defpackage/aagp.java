package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aagp extends defpackage.aagf implements defpackage.aacv {
    public static volatile java.util.concurrent.Executor t;
    private final java.util.Set a;
    public final defpackage.aagi u;
    private final android.accounts.Account v;

    protected aagp(android.content.Context context, android.os.Looper looper, int i, defpackage.aagi aagiVar, defpackage.aaei aaeiVar, defpackage.aafi aafiVar) {
        super(context, looper, defpackage.aagv.b(context), defpackage.aabx.a, i, new defpackage.apnt(aaeiVar, (byte[]) null), new defpackage.apnt(aafiVar, (byte[]) null), aagiVar.f);
        this.u = aagiVar;
        this.v = aagiVar.a;
        java.util.Set set = aagiVar.c;
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((com.google.android.gms.common.api.Scope) it.next())) {
                throw new java.lang.IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.a = set;
        if (t == null) {
            synchronized (defpackage.aagp.class) {
                if (t == null && defpackage.aagt.a(context.getPackageName())) {
                    t = defpackage.aagr.a(context);
                }
            }
        }
    }

    @Override // defpackage.aagf
    protected final java.util.concurrent.Executor A() {
        return t;
    }

    @Override // defpackage.aagf
    public final com.google.android.gms.common.Feature[] L() {
        return new com.google.android.gms.common.Feature[0];
    }

    @Override // defpackage.aagf, defpackage.aacv
    public int a() {
        throw null;
    }

    @Override // defpackage.aacv
    public final java.util.Set l() {
        return i() ? this.a : java.util.Collections.EMPTY_SET;
    }

    @Override // defpackage.aagf
    public final android.accounts.Account u() {
        return this.v;
    }

    @Override // defpackage.aagf
    protected final java.util.Set z() {
        return this.a;
    }
}
