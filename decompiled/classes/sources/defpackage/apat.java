package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class apat extends defpackage.aoyw implements defpackage.aozh {
    public apat(int i) {
        super(1, Integer.MAX_VALUE, 2);
        d(java.lang.Integer.valueOf(i));
    }

    @Override // defpackage.aozh
    public final /* bridge */ /* synthetic */ java.lang.Object c() {
        java.lang.Integer numValueOf;
        synchronized (this) {
            numValueOf = java.lang.Integer.valueOf(((java.lang.Number) h()).intValue());
        }
        return numValueOf;
    }

    public final void o(int i) {
        synchronized (this) {
            d(java.lang.Integer.valueOf(((java.lang.Number) h()).intValue() + i));
        }
    }
}
