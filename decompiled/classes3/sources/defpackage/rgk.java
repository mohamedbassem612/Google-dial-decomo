package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rgk extends defpackage.rgm {
    private final defpackage.rgr a;

    public rgk(defpackage.rgr rgrVar) {
        this.a = rgrVar;
    }

    @Override // defpackage.rgm, defpackage.rgs
    public final defpackage.rgr a() {
        return this.a;
    }

    @Override // defpackage.rgs
    public final int b() {
        return 2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.rgs)) {
            return false;
        }
        defpackage.rgs rgsVar = (defpackage.rgs) obj;
        return rgsVar.b() == 2 && this.a.equals(rgsVar.a());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "TitleText{countdownText=" + this.a.toString() + '}';
    }
}
