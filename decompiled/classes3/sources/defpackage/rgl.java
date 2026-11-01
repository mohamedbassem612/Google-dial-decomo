package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rgl extends defpackage.rgm {
    private final int a;

    public rgl(int i) {
        this.a = i;
    }

    @Override // defpackage.rgs
    public final int b() {
        return 1;
    }

    @Override // defpackage.rgm, defpackage.rgs
    public final int c() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.rgs)) {
            return false;
        }
        defpackage.rgs rgsVar = (defpackage.rgs) obj;
        return rgsVar.b() == 1 && this.a == rgsVar.c();
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "TitleText{textRes=" + this.a + '}';
    }
}
