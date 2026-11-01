package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ykx implements defpackage.ykp {
    public ykx(java.util.List list) {
        aooh.f(list, "permissions");
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new defpackage.yky((java.lang.String) list.get(i), defpackage.yku.a));
        }
    }

    @Override // defpackage.ykp
    public final boolean b() {
        return false;
    }

    @Override // defpackage.ykp
    public final void a() {
    }
}
