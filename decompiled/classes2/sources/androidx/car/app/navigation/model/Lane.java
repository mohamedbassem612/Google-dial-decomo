package androidx.car.app.navigation.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class Lane {
    private final java.util.List mDirections;

    Lane(java.util.List list) {
        this.mDirections = defpackage.rv.d(list);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.navigation.model.Lane) {
            return j$.util.Objects.equals(this.mDirections, ((androidx.car.app.navigation.model.Lane) obj).mDirections);
        }
        return false;
    }

    public java.util.List getDirections() {
        return defpackage.rv.c(this.mDirections);
    }

    public int hashCode() {
        return j$.util.Objects.hashCode(this.mDirections);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[direction count: ");
        java.util.List list = this.mDirections;
        sb.append(list != null ? list.size() : 0);
        sb.append(']');
        return sb.toString();
    }

    private Lane() {
        this.mDirections = java.util.Collections.EMPTY_LIST;
    }
}
