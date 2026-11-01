package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bq extends defpackage.eoa {
    public static final defpackage.eoe a = new defpackage.bp();
    public final boolean e;
    public final java.util.HashMap b = new java.util.HashMap();
    public final java.util.HashMap c = new java.util.HashMap();
    public final java.util.HashMap d = new java.util.HashMap();
    public boolean f = false;
    public boolean g = false;

    public bq(boolean z) {
        this.e = z;
    }

    private final void h(java.lang.String str, boolean z) {
        java.util.HashMap map = this.c;
        defpackage.bq bqVar = (defpackage.bq) map.get(str);
        if (bqVar != null) {
            if (z) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.addAll(bqVar.c.keySet());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    bqVar.c((java.lang.String) arrayList.get(i), true);
                }
            }
            bqVar.d();
            map.remove(str);
        }
        java.util.HashMap map2 = this.d;
        defpackage.eoh eohVar = (defpackage.eoh) map2.get(str);
        if (eohVar != null) {
            eohVar.a();
            map2.remove(str);
        }
    }

    public final void a(defpackage.aw awVar) {
        if (this.g) {
            if (defpackage.bo.Z(2)) {
                android.util.Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        java.util.HashMap map = this.b;
        if (map.containsKey(awVar.l)) {
            return;
        }
        map.put(awVar.l, awVar);
        if (defpackage.bo.Z(2)) {
            java.util.Objects.toString(awVar);
            android.util.Log.v("FragmentManager", "Updating retained Fragments: Added ".concat(java.lang.String.valueOf(awVar)));
        }
    }

    final void b(defpackage.aw awVar, boolean z) {
        if (defpackage.bo.Z(3)) {
            java.util.Objects.toString(awVar);
            android.util.Log.d("FragmentManager", "Clearing non-config state for ".concat(java.lang.String.valueOf(awVar)));
        }
        h(awVar.l, z);
    }

    final void c(java.lang.String str, boolean z) {
        if (defpackage.bo.Z(3)) {
            android.util.Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment ".concat(java.lang.String.valueOf(str)));
        }
        h(str, z);
    }

    @Override // defpackage.eoa
    protected final void d() {
        if (defpackage.bo.Z(3)) {
            toString();
            android.util.Log.d("FragmentManager", "onCleared called for ".concat(toString()));
        }
        this.f = true;
    }

    final void e(defpackage.aw awVar) {
        if (this.g) {
            if (defpackage.bo.Z(2)) {
                android.util.Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.b.remove(awVar.l) == null || !defpackage.bo.Z(2)) {
                return;
            }
            java.util.Objects.toString(awVar);
            android.util.Log.v("FragmentManager", "Updating retained Fragments: Removed ".concat(java.lang.String.valueOf(awVar)));
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.bq bqVar = (defpackage.bq) obj;
            if (this.b.equals(bqVar.b) && this.c.equals(bqVar.c) && this.d.equals(bqVar.d)) {
                return true;
            }
        }
        return false;
    }

    final boolean f(defpackage.aw awVar) {
        if (this.b.containsKey(awVar.l) && this.e) {
            return this.f;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FragmentManagerViewModel{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append("} Fragments (");
        java.util.Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        java.util.Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((java.lang.String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        java.util.Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((java.lang.String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
