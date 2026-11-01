package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
abstract class aigh extends aihd {
    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use EntrySetSerializedForm");
    }

    public abstract aigf a();

    public final boolean b() {
        return false;
    }

    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object obj2 = a().get(entry.getKey());
        return obj2 != null && obj2.equals(entry.getValue());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final boolean l() {
        return a().fr();
    }

    public final int size() {
        return a().size();
    }

    public java.lang.Object writeReplace() {
        return new defpackage.aigg(a());
    }
}
