package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zmu {
    public defpackage.zmw a;
    private j$.util.Optional b = j$.util.Optional.empty();
    private j$.util.Optional c = j$.util.Optional.empty();
    private j$.util.Optional d = j$.util.Optional.empty();

    public final defpackage.zmv a() {
        defpackage.zmw zmwVar = this.a;
        if (zmwVar != null) {
            return new defpackage.zmv(zmwVar, this.b, this.c, this.d);
        }
        throw new java.lang.IllegalStateException("Missing required properties: audioRoute");
    }

    public final void b(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null bluetoothDevice");
        }
        this.b = optional;
    }

    public final void c(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null name");
        }
        this.c = optional;
    }

    public final void d(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null selected");
        }
        this.d = optional;
    }
}
