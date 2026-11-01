package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hdz implements defpackage.hdo {
    public final android.graphics.Path.FillType a;
    public final java.lang.String b;
    public final defpackage.hda c;
    public final defpackage.hdd d;
    public final boolean e;
    private final boolean f;

    public hdz(java.lang.String str, boolean z, android.graphics.Path.FillType fillType, defpackage.hda hdaVar, defpackage.hdd hddVar, boolean z2) {
        this.b = str;
        this.f = z;
        this.a = fillType;
        this.c = hdaVar;
        this.d = hddVar;
        this.e = z2;
    }

    @Override // defpackage.hdo
    public final defpackage.hag a(defpackage.gzs gzsVar, defpackage.gzh gzhVar, defpackage.hef hefVar) {
        return new defpackage.hak(gzsVar, hefVar, this);
    }

    public final java.lang.String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f + '}';
    }
}
