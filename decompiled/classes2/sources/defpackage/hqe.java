package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hqe {
    private static final aimz a = aimz.i("com/android/dialer/androidauto/impl/precall/CarPreCall");
    private final jxe b;

    public hqe(jxe jxeVar) {
        this.b = jxeVar;
    }

    public final void a(defpackage.tt ttVar, com.android.dialer.callintent.CallIntent$Builder callIntent$Builder) {
        aooh.f(ttVar, "carContext");
        ahoq ahoqVarW = ahvr.W(72, "CarPreCall_start");
        try {
            if (!this.b.c(callIntent$Builder.w())) {
                a.d().l("com/android/dialer/androidauto/impl/precall/CarPreCall", "start$<anonymous>", 30, "CarPreCall.kt").v("Either CALL_PHONE or READ_PHONE_STATE is missing");
                defpackage.bjz.b(ttVar, ttVar.getString(2132019782), 1).a();
            }
            ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahoqVarW, th);
                throw th2;
            }
        }
    }
}
