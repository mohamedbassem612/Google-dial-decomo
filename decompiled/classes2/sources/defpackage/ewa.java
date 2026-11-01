package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ewa extends defpackage.aiew {
    private final java.util.Map a;

    public ewa(java.util.Map map) {
        this.a = map;
    }

    @Override // defpackage.aiew
    protected final java.util.Map b() {
        return this.a;
    }

    @Override // defpackage.aiew, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // defpackage.aiew, java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return ahvr.be(new defpackage.aiit(entrySet().iterator()), obj);
    }

    @Override // defpackage.aiew, java.util.Map
    public final java.util.Set entrySet() {
        return ahvr.aq(this.a.entrySet(), new defpackage.evz(1));
    }

    @Override // defpackage.aiew, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        return obj != null && ahvr.aJ(this, obj);
    }

    protected final /* synthetic */ java.lang.Object fp() {
        return this.a;
    }

    @Override // defpackage.aiew, java.util.Map
    public final /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return (java.util.List) this.a.get(obj);
    }

    @Override // defpackage.aiew, java.util.Map
    public final int hashCode() {
        return ahvr.al(entrySet());
    }

    @Override // defpackage.aiew, java.util.Map
    public final boolean isEmpty() {
        if (this.a.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // defpackage.aiew, java.util.Map
    public final java.util.Set keySet() {
        return ahvr.aq(this.a.keySet(), new defpackage.evz(0));
    }

    @Override // defpackage.aiew, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
