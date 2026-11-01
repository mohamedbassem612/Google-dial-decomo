package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aakn extends defpackage.aada {
    public final android.content.Context a;
    private final defpackage.ahzi l;

    public aakn(android.content.Context context, defpackage.ahzi ahziVar) {
        super(context, null, defpackage.aakg.a, defpackage.aact.q, defpackage.aacz.a);
        this.a = context;
        int i = defpackage.aaki.a;
        defpackage.ahvr.bI(new defpackage.rwp(context, 16));
        this.l = ahziVar;
    }

    public static boolean b(defpackage.ajdo ajdoVar, defpackage.ajdn ajdnVar) {
        return ajdoVar != null && new defpackage.alam(ajdoVar.c, defpackage.ajdo.a).contains(ajdnVar);
    }

    public final defpackage.aaum a() {
        defpackage.zzx zzxVar = new defpackage.zzx((char[]) null);
        defpackage.aakh aakhVar = new defpackage.aakh("wrapper");
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.a = new defpackage.aasu(1);
        aafqVar.c = 12301;
        int i = 0;
        defpackage.aaum aaumVarI = super.i(0, aafqVar.a());
        if (java.util.concurrent.TimeUnit.SECONDS == null) {
            throw new java.lang.NullPointerException("TimeUnit must not be null");
        }
        final defpackage.zzx zzxVar2 = new defpackage.zzx((char[]) null);
        final defpackage.zzx zzxVar3 = new defpackage.zzx(zzxVar2);
        final defpackage.aanh aanhVar = new defpackage.aanh(android.os.Looper.getMainLooper());
        aanhVar.postDelayed(new defpackage.ddv(zzxVar3, 18), 5000L);
        aaumVarI.m(new defpackage.aaug() { // from class: aaur
            @Override // defpackage.aaug
            public final void a(defpackage.aaum aaumVar) {
                aanhVar.removeCallbacksAndMessages(null);
                defpackage.zzx zzxVar4 = zzxVar3;
                if (aaumVar.k()) {
                    zzxVar4.i(aaumVar.g());
                } else if (((defpackage.aauq) aaumVar).c) {
                    zzxVar2.j();
                } else {
                    zzxVar4.h((java.lang.Exception) j$.util.Objects.requireNonNull(aaumVar.f()));
                }
            }
        });
        defpackage.aaum aaumVar = (defpackage.aaum) zzxVar3.a;
        aaumVar.q(new defpackage.aakl(aakhVar, zzxVar, 2));
        aaumVar.p((java.util.concurrent.Executor) this.l.eZ(), new defpackage.aakm(this, aakhVar, zzxVar, i));
        return (defpackage.aaum) zzxVar.a;
    }
}
