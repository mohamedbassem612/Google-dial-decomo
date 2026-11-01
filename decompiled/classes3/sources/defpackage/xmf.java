package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xmf extends aojj {
    private final aoir a;

    public xmf(java.util.Collection collection) {
        this.a = aooc.ag(new defpackage.wsn(collection, 19));
    }

    private final java.util.List b() {
        return (java.util.List) this.a.a();
    }

    public final int a() {
        return b().size();
    }

    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof defpackage.xme) {
            return super.contains((defpackage.xme) obj);
        }
        return false;
    }

    public final java.util.Iterator iterator() {
        return b().iterator();
    }
}
