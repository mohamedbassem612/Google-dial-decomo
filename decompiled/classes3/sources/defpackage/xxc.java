package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xxc {
    public final dxz a;
    public final java.util.List b;
    public final java.lang.String c;

    public xxc(java.lang.Class cls, java.lang.Class cls2, java.lang.Class cls3, java.util.List list, dxz dxzVar) {
        this.a = dxzVar;
        defpackage.xfh.u(list);
        this.b = list;
        this.c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + '}';
    }

    public final java.lang.String toString() {
        return "LoadPath{decodePaths=" + java.util.Arrays.toString(this.b.toArray()) + '}';
    }
}
