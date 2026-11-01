package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
abstract class aija extends java.util.AbstractMap {
    public abstract java.util.Iterator a();

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        ahvr.bc(a());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        return new defpackage.aiiz(this);
    }
}
