package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bu {
    public final java.util.ArrayList a = new java.util.ArrayList();
    public final java.util.HashMap b = new java.util.HashMap();
    public final java.util.HashMap c = new java.util.HashMap();
    public defpackage.bq d;

    final android.os.Bundle a(java.lang.String str, android.os.Bundle bundle) {
        java.util.HashMap map = this.c;
        return bundle != null ? (android.os.Bundle) map.put(str, bundle) : (android.os.Bundle) map.remove(str);
    }

    final defpackage.aw b(java.lang.String str) {
        defpackage.bt btVar = (defpackage.bt) this.b.get(str);
        if (btVar != null) {
            return btVar.a;
        }
        return null;
    }

    final defpackage.aw c(java.lang.String str) {
        for (defpackage.bt btVar : this.b.values()) {
            if (btVar != null) {
                defpackage.aw awVarC = btVar.a;
                if (!str.equals(awVarC.l)) {
                    awVarC = awVarC.D.c.c(str);
                }
                if (awVarC != null) {
                    return awVarC;
                }
            }
        }
        return null;
    }

    public final defpackage.bt d(java.lang.String str) {
        return (defpackage.bt) this.b.get(str);
    }

    final java.util.List e() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (defpackage.bt btVar : this.b.values()) {
            if (btVar != null) {
                arrayList.add(btVar);
            }
        }
        return arrayList;
    }

    final java.util.List f() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (defpackage.bt btVar : this.b.values()) {
            if (btVar != null) {
                arrayList.add(btVar.a);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    final java.util.List g() {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2 = this.a;
        if (arrayList2.isEmpty()) {
            return java.util.Collections.EMPTY_LIST;
        }
        synchronized (arrayList2) {
            arrayList = new java.util.ArrayList(arrayList2);
        }
        return arrayList;
    }

    final void h(defpackage.aw awVar) {
        java.util.ArrayList arrayList = this.a;
        if (arrayList.contains(awVar)) {
            java.util.Objects.toString(awVar);
            throw new java.lang.IllegalStateException("Fragment already added: ".concat(java.lang.String.valueOf(awVar)));
        }
        synchronized (arrayList) {
            arrayList.add(awVar);
        }
        awVar.r = true;
    }

    final void i() {
        this.b.values().removeAll(java.util.Collections.singleton(null));
    }

    final void j(defpackage.bt btVar) {
        defpackage.aw awVar = btVar.a;
        if (m(awVar.l)) {
            return;
        }
        this.b.put(awVar.l, btVar);
        if (awVar.L) {
            boolean z = awVar.K;
            defpackage.bq bqVar = this.d;
            if (z) {
                bqVar.a(awVar);
            } else {
                bqVar.e(awVar);
            }
            awVar.L = false;
        }
        if (defpackage.bo.Z(2)) {
            java.util.Objects.toString(awVar);
            android.util.Log.v("FragmentManager", "Added fragment to active set ".concat(java.lang.String.valueOf(awVar)));
        }
    }

    final void k(defpackage.bt btVar) {
        defpackage.aw awVar = btVar.a;
        if (awVar.K) {
            this.d.e(awVar);
        }
        java.util.HashMap map = this.b;
        if (map.get(awVar.l) == btVar && ((defpackage.bt) map.put(awVar.l, null)) != null && defpackage.bo.Z(2)) {
            java.util.Objects.toString(awVar);
            android.util.Log.v("FragmentManager", "Removed fragment from active set ".concat(java.lang.String.valueOf(awVar)));
        }
    }

    final void l(defpackage.aw awVar) {
        java.util.ArrayList arrayList = this.a;
        synchronized (arrayList) {
            arrayList.remove(awVar);
        }
        awVar.r = false;
    }

    final boolean m(java.lang.String str) {
        return this.b.get(str) != null;
    }
}
