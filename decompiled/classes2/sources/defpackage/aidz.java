package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aidz extends defpackage.aicw {
    final /* synthetic */ aieb a;
    private final java.lang.Object b;
    private int c;

    public aidz(aieb aiebVar, int i) {
        j$.util.Objects.requireNonNull(aiebVar);
        this.a = aiebVar;
        this.b = aiebVar.e(i);
        this.c = i;
    }

    private final void a() {
        int i = this.c;
        if (i != -1) {
            aieb aiebVar = this.a;
            if (i < aiebVar.size() && j$.util.Objects.equals(this.b, aiebVar.e(this.c))) {
                return;
            }
        }
        this.c = this.a.d(this.b);
    }

    @Override // defpackage.aicw, java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.b;
    }

    @Override // defpackage.aicw, java.util.Map.Entry
    public final java.lang.Object getValue() {
        aieb aiebVar = this.a;
        java.util.Map mapJ = aiebVar.j();
        if (mapJ != null) {
            return mapJ.get(this.b);
        }
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        return aiebVar.h(i);
    }

    @Override // defpackage.aicw, java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        aieb aiebVar = this.a;
        java.util.Map mapJ = aiebVar.j();
        if (mapJ != null) {
            return mapJ.put(this.b, obj);
        }
        a();
        int i = this.c;
        if (i == -1) {
            aiebVar.put(this.b, obj);
            return null;
        }
        java.lang.Object objH = aiebVar.h(i);
        aiebVar.n(this.c, obj);
        return objH;
    }
}
