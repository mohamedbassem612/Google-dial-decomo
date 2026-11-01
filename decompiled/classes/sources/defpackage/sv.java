package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class sv implements java.lang.Iterable {
    public defpackage.sr a;
    public defpackage.sr b;
    public final java.util.WeakHashMap c = new java.util.WeakHashMap();
    public int d = 0;

    public final defpackage.sr a(java.lang.Object obj) {
        defpackage.sr srVar = this.a;
        while (srVar != null && !srVar.a.equals(obj)) {
            srVar = srVar.c;
        }
        return srVar;
    }

    public final java.lang.Object b(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.sr srVarA = a(obj);
        if (srVarA != null) {
            return srVarA.b;
        }
        defpackage.sr srVar = new defpackage.sr(obj, obj2);
        this.d++;
        defpackage.sr srVar2 = this.b;
        if (srVar2 == null) {
            this.a = srVar;
        } else {
            srVar2.c = srVar;
            srVar.d = srVar2;
        }
        this.b = srVar;
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.sv) {
            defpackage.sv svVar = (defpackage.sv) obj;
            if (this.d == svVar.d) {
                java.util.Iterator it = iterator();
                java.util.Iterator it2 = svVar.iterator();
                while (it.hasNext() && it2.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    java.lang.Object next = it2.next();
                    if (entry != null) {
                        if (entry != null || entry.equals(next)) {
                        }
                    } else if (next == null) {
                        next = null;
                        if (entry != null) {
                        }
                    }
                }
                if (!it.hasNext() && !it2.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.util.Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((java.util.Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        st stVar = new st(this.a, this.b);
        this.c.put(stVar, java.lang.Boolean.FALSE);
        return stVar;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        java.util.Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((java.util.Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }
}
