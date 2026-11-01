package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hdt implements defpackage.hdo {
    public final boolean a;
    public final int b;

    public hdt(int i, boolean z) {
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.hdo
    public final defpackage.hag a(defpackage.gzs gzsVar, defpackage.gzh gzhVar, defpackage.hef hefVar) {
        if (gzsVar.i) {
            return new defpackage.hap(this);
        }
        defpackage.hge.a("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.b;
        if (i == 1) {
            str = "MERGE";
        } else if (i == 2) {
            str = "ADD";
        } else if (i == 3) {
            str = "SUBTRACT";
        } else if (i != 4) {
            str = i != 5 ? "null" : "EXCLUDE_INTERSECTIONS";
        } else {
            str = "INTERSECT";
        }
        return a.bp((byte) 125, str, "MergePaths{mode=");
    }
}
