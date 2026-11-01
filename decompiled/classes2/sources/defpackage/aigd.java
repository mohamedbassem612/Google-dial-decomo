package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
abstract class aigd extends aigf {
    private transient aihd b;
    private transient aihd c;
    private transient aifo d;

    public abstract ailj a();

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final aifo values() {
        aifo aifoVar = this.d;
        if (aifoVar != null) {
            return aifoVar;
        }
        defpackage.aign aignVar = new defpackage.aign(this);
        this.d = aignVar;
        return aignVar;
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final aihd entrySet() {
        aihd aihdVar = this.b;
        if (aihdVar != null) {
            return aihdVar;
        }
        defpackage.aigc aigcVar = new defpackage.aigc(this);
        this.b = aigcVar;
        return aigcVar;
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final aihd keySet() {
        aihd aihdVar = this.c;
        if (aihdVar != null) {
            return aihdVar;
        }
        defpackage.aigj aigjVar = new defpackage.aigj(this);
        this.c = aigjVar;
        return aigjVar;
    }

    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
