package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class tmd implements defpackage.zcs {
    public final /* synthetic */ defpackage.tkk a;
    public final /* synthetic */ defpackage.aoin b;
    public final /* synthetic */ defpackage.aoin c;

    public /* synthetic */ tmd(defpackage.tkk tkkVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2) {
        this.a = tkkVar;
        this.b = aoinVar;
        this.c = aoinVar2;
    }

    @Override // defpackage.zcs
    public final boolean a() {
        if (this.a.a()) {
            return ((java.lang.Boolean) this.b.a()).booleanValue() || ((java.lang.Boolean) this.c.a()).booleanValue();
        }
        return false;
    }
}
