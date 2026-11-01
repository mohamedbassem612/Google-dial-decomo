package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class uqz {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public java.lang.Object c;
    public final java.lang.Object d;

    public uqz(defpackage.aoss aossVar) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        this.b = aossVar;
        this.d = new defpackage.ahda((byte[]) null);
        this.c = new defpackage.kex(0);
        this.a = new java.util.concurrent.atomic.AtomicReference(defpackage.kez.a);
    }

    public final dvc a() {
        java.lang.String string = java.util.UUID.randomUUID().toString();
        this.c = j$.util.Optional.of(string);
        dvn dvnVar = new dvn();
        dvnVar.a = string;
        return dvnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq b(int i, java.lang.String str, int i2, int i3) {
        if (!((j$.util.Optional) this.c).isPresent()) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Required dismissal ID for SyncedNotification message. type: %s.", i2 != 2 ? "NOTIFICATION_TYPE_VOICEMAIL" : "NOTIFICATION_TYPE_MISSED_CALL"));
        }
        uqx uqxVar = new uqx(this, (java.lang.String) ((j$.util.Optional) this.c).orElseThrow(), i2, i3, str);
        ?? r8 = this.b;
        return defpackage.ahvr.Q(uqxVar, r8).h(new uqy(this, i, 0), r8);
    }

    public final void c(defpackage.gdq gdqVar, defpackage.aonn aonnVar) {
        synchronized (this.d) {
            if (gdqVar != null) {
                this.c = gdqVar;
            }
            aonnVar.a(this.b, this.a);
        }
    }

    public uqz() {
        this.b = new defpackage.aaha();
        this.a = new defpackage.aaha();
        this.d = new defpackage.gfz(null);
    }

    public uqz(defpackage.rlv rlvVar, defpackage.tvn tvnVar, defpackage.ajct ajctVar) {
        this.c = j$.util.Optional.empty();
        this.a = rlvVar;
        this.d = tvnVar;
        this.b = ajctVar;
    }
}
