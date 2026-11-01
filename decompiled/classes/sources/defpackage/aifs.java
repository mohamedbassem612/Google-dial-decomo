package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aifs extends defpackage.aihd {
    private final transient java.util.EnumSet a;
    private transient int b;

    public aifs(java.util.EnumSet enumSet) {
        this.a = enumSet;
    }

    public static defpackage.aihd a(java.util.EnumSet enumSet) {
        int size = enumSet.size();
        if (size != 0) {
            return size != 1 ? new defpackage.aifs(enumSet) : new defpackage.aile((java.lang.Enum) defpackage.ahvr.aZ(enumSet.iterator()));
        }
        return defpackage.aikn.a;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.aihd
    public final boolean b() {
        return true;
    }

    @Override // defpackage.aifo, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection collection) {
        if (collection instanceof defpackage.aifs) {
            collection = ((defpackage.aifs) collection).a;
        }
        return this.a.containsAll(collection);
    }

    @Override // defpackage.aihd, java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aifs) {
            obj = ((defpackage.aifs) obj).a;
        }
        return this.a.equals(obj);
    }

    @Override // defpackage.aihd, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.a.hashCode();
        this.b = iHashCode;
        return iHashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // defpackage.aihd, defpackage.aifo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: k */
    public final defpackage.ailj iterator() {
        return defpackage.ahvr.aV(this.a.iterator());
    }

    @Override // defpackage.aifo
    public final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        return this.a.toString();
    }

    @Override // defpackage.aihd, defpackage.aifo
    public java.lang.Object writeReplace() {
        return new aifr(this.a);
    }
}
