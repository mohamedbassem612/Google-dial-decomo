package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aicz implements defpackage.aije {
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aije) {
            return o().equals(((defpackage.aije) obj).o());
        }
        return false;
    }

    public final int hashCode() {
        return o().hashCode();
    }

    public abstract java.util.Iterator l();

    public java.util.Iterator m() {
        throw null;
    }

    @Override // defpackage.aije
    public void t(java.lang.Object obj, java.lang.Object obj2) {
        throw null;
    }

    public final java.lang.String toString() {
        return o().toString();
    }

    @Override // defpackage.aije
    public final boolean u(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Collection collection = (java.util.Collection) o().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean v(java.lang.Object obj) {
        java.util.Iterator it = o().values().iterator();
        while (it.hasNext()) {
            if (((java.util.Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aije
    public boolean w() {
        return h() == 0;
    }

    @Override // defpackage.aije
    public boolean x(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Collection collection = (java.util.Collection) o().get(obj);
        return collection != null && collection.remove(obj2);
    }

    @Override // defpackage.aije
    public void y(defpackage.aije aijeVar) {
        for (java.util.Map.Entry entry : aijeVar.i()) {
            t(entry.getKey(), entry.getValue());
        }
    }
}
