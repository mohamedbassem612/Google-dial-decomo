package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aojs extends java.util.AbstractMap implements java.util.Map, defpackage.aopa {
    protected aojs() {
    }

    public /* bridge */ int b() {
        throw null;
    }

    public /* bridge */ java.util.Collection d() {
        throw null;
    }

    public abstract java.util.Set e();

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set entrySet() {
        return e();
    }

    public /* bridge */ java.util.Set f() {
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set keySet() {
        return f();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return b();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Collection values() {
        return d();
    }
}
