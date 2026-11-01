package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
abstract class aiix extends ailc {
    public abstract java.util.Map a();

    public final void clear() {
        a().clear();
    }

    public boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object key = entry.getKey();
        java.lang.Object objAE = ahvr.aE(a(), key);
        if (j$.util.Objects.equals(objAE, entry.getValue())) {
            return objAE != null || a().containsKey(key);
        }
        return false;
    }

    public final boolean isEmpty() {
        return a().isEmpty();
    }

    public boolean remove(java.lang.Object obj) {
        if (contains(obj) && (obj instanceof java.util.Map.Entry)) {
            return a().keySet().remove(((java.util.Map.Entry) obj).getKey());
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean removeAll(java.util.Collection collection) {
        try {
            ahvr.ci(collection);
            return ahvr.au(this, collection);
        } catch (java.lang.UnsupportedOperationException unused) {
            return ahvr.av(this, collection.iterator());
        }
    }

    public final boolean retainAll(java.util.Collection collection) {
        try {
            ahvr.ci(collection);
            return super.retainAll(collection);
        } catch (java.lang.UnsupportedOperationException unused) {
            java.util.HashSet hashSetAp = ahvr.ap(collection.size());
            for (java.lang.Object obj : collection) {
                if (contains(obj) && (obj instanceof java.util.Map.Entry)) {
                    hashSetAp.add(((java.util.Map.Entry) obj).getKey());
                }
            }
            return a().keySet().retainAll(hashSetAp);
        }
    }

    public final int size() {
        return a().size();
    }
}
