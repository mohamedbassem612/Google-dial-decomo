package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aifa extends defpackage.aicw {
    final java.lang.Object a;
    int b;
    final /* synthetic */ defpackage.aifg c;

    public aifa(defpackage.aifg aifgVar, int i) {
        j$.util.Objects.requireNonNull(aifgVar);
        this.c = aifgVar;
        this.a = aifgVar.a[i];
        this.b = i;
    }

    final void a() {
        int i = this.b;
        if (i != -1) {
            defpackage.aifg aifgVar = this.c;
            if (i <= aifgVar.c && j$.util.Objects.equals(aifgVar.a[i], this.a)) {
                return;
            }
        }
        this.b = this.c.a(this.a);
    }

    @Override // defpackage.aicw, java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.a;
    }

    @Override // defpackage.aicw, java.util.Map.Entry
    public final java.lang.Object getValue() {
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return this.c.b[i];
    }

    @Override // defpackage.aicw, java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        a();
        int i = this.b;
        defpackage.aifg aifgVar = this.c;
        if (i == -1) {
            aifgVar.g(this.a, obj);
            return null;
        }
        java.lang.Object obj2 = aifgVar.b[i];
        if (j$.util.Objects.equals(obj2, obj)) {
            return obj;
        }
        aifgVar.h(this.b, obj);
        return obj2;
    }
}
