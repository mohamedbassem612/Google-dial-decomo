package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aepb extends aepe {
    public final ahzi a;
    private final ahzi b;

    public aepb(final long j) {
        if (j <= -100 || j >= 100) {
            final int i = 2;
            this.a = ahvr.bI(new ahzi() { // from class: aepa
                public final java.lang.Object eZ() {
                    int i2 = i;
                    if (i2 == 0) {
                        return java.lang.String.valueOf(j);
                    }
                    long j2 = j;
                    return i2 != 1 ? java.lang.String.format(java.util.Locale.US, "%.1e", java.lang.Double.valueOf(j2)) : java.lang.Long.valueOf(j2);
                }
            });
            this.b = ahvr.bI(new aell(this, 8));
        } else {
            final int i2 = 1;
            this.b = ahvr.bI(new ahzi() { // from class: aepa
                public final java.lang.Object eZ() {
                    int i3 = i2;
                    if (i3 == 0) {
                        return java.lang.String.valueOf(j);
                    }
                    long j2 = j;
                    return i3 != 1 ? java.lang.String.format(java.util.Locale.US, "%.1e", java.lang.Double.valueOf(j2)) : java.lang.Long.valueOf(j2);
                }
            });
            final int i3 = 0;
            this.a = ahvr.bI(new ahzi() { // from class: aepa
                public final java.lang.Object eZ() {
                    int i4 = i3;
                    if (i4 == 0) {
                        return java.lang.String.valueOf(j);
                    }
                    long j2 = j;
                    return i4 != 1 ? java.lang.String.format(java.util.Locale.US, "%.1e", java.lang.Double.valueOf(j2)) : java.lang.Long.valueOf(j2);
                }
            });
        }
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        return (java.lang.Long) this.b.eZ();
    }

    public final java.lang.String b() {
        return (java.lang.String) this.a.eZ();
    }
}
