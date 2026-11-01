package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aiep extends defpackage.aiez implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final int a;
    private final java.util.Queue b;

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public aiep(int i) {
        ahvr.bP((boolean) ((i ^ (-1)) >>> 31), "maxSize (%s) must >= 0", i);
        this.b = new java.util.ArrayDeque(i);
        this.a = i;
    }

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        ahvr.ci(obj);
        int i = this.a;
        if (i != 0) {
            if (size() == i) {
                this.b.remove();
            }
            this.b.add(obj);
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        int size = collection.size();
        int i = this.a;
        if (size < i) {
            return ahvr.bd(this, collection.iterator());
        }
        clear();
        return ahvr.bp(this, ahvr.bg(collection, size - i));
    }

    public final int b() {
        return this.a - size();
    }

    @Override // defpackage.aiez
    protected final /* synthetic */ java.util.Collection c() {
        return this.b;
    }

    @Override // defpackage.aiez
    protected final java.util.Queue d() {
        return this.b;
    }

    protected final /* synthetic */ java.lang.Object fp() {
        return this.b;
    }

    @Override // defpackage.aiez, java.util.Queue
    public final boolean offer(java.lang.Object obj) {
        add(obj);
        return true;
    }
}
