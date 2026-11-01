package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hea implements defpackage.hdo {
    public final java.lang.String a;
    public final java.util.List b;
    public final boolean c;

    public hea(java.lang.String str, java.util.List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override // defpackage.hdo
    public final defpackage.hag a(defpackage.gzs gzsVar, defpackage.gzh gzhVar, defpackage.hef hefVar) {
        return new defpackage.hah(gzsVar, hefVar, this, gzhVar);
    }

    public final java.lang.String toString() {
        return "ShapeGroup{name='" + this.a + "' Shapes: " + java.util.Arrays.toString(this.b.toArray()) + '}';
    }
}
