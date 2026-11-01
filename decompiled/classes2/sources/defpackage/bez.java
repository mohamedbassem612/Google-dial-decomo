package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class bez {
    public final java.util.List a;
    public final java.util.List[] b;
    public int c;
    public int d;
    public boolean e;
    final /* synthetic */ defpackage.bfa f;

    public bez(defpackage.bfa bfaVar, java.util.List list) {
        this.f = bfaVar;
        this.a = list;
        this.b = new java.util.List[list.size()];
        if (list.isEmpty()) {
            defpackage.avo.c("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
