package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class Metadata {
    public static final androidx.car.app.model.Metadata EMPTY_METADATA = new androidx.car.app.model.Metadata(new xp());
    private final androidx.car.app.model.Place mPlace;

    public Metadata(xp xpVar) {
        java.lang.Object obj = xpVar.a;
        this.mPlace = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.Metadata) {
            return j$.util.Objects.equals(this.mPlace, ((androidx.car.app.model.Metadata) obj).mPlace);
        }
        return false;
    }

    public androidx.car.app.model.Place getPlace() {
        return this.mPlace;
    }

    public int hashCode() {
        return j$.util.Objects.hashCode(this.mPlace);
    }

    private Metadata() {
        this.mPlace = null;
    }
}
