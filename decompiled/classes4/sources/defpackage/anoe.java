package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anoe extends defpackage.anol {
    private final defpackage.anoh a;

    public anoe(defpackage.anoh anohVar) {
        ahvr.cj(anohVar, "result");
        this.a = anohVar;
    }

    @Override // defpackage.anol
    public final defpackage.anoh a(defpackage.anoi anoiVar) {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.anoe) {
            return this.a.equals(((defpackage.anoe) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "FixedResultPicker(" + this.a.toString() + ')';
    }
}
