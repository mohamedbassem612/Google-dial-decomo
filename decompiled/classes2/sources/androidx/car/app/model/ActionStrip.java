package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class ActionStrip {
    private final java.util.List mActions;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public ActionStrip(vx vxVar) {
        this.mActions = defpackage.rv.d(vxVar.a);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.ActionStrip) {
            return j$.util.Objects.equals(this.mActions, ((androidx.car.app.model.ActionStrip) obj).mActions);
        }
        return false;
    }

    public java.util.List getActions() {
        return defpackage.rv.c(this.mActions);
    }

    public androidx.car.app.model.Action getFirstActionOfType(int i) {
        for (java.lang.Object obj : this.mActions) {
            if (obj instanceof androidx.car.app.model.Action) {
                androidx.car.app.model.Action action = (androidx.car.app.model.Action) obj;
                if (action.getType() == i) {
                    return action;
                }
            }
        }
        return null;
    }

    public int hashCode() {
        return j$.util.Objects.hashCode(this.mActions);
    }

    public java.lang.String toString() {
        return "[action count: " + this.mActions.size() + ']';
    }

    private ActionStrip() {
        this.mActions = java.util.Collections.EMPTY_LIST;
    }
}
