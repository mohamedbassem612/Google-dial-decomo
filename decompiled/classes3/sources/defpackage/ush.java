package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ush implements defpackage.zoi, zog {
    public final ajct a;
    public final defpackage.ute b;
    public final defpackage.usj c;
    public final rlv d;
    public j$.util.Optional e = j$.util.Optional.empty();
    public j$.util.Optional f = j$.util.Optional.empty();
    private final java.lang.String g;
    private final defpackage.abtr h;

    public ush(ajct ajctVar, java.lang.String str, defpackage.ute uteVar, defpackage.usj usjVar, rlv rlvVar, defpackage.abtr abtrVar) {
        this.a = ajctVar;
        this.g = str;
        this.b = uteVar;
        this.c = usjVar;
        this.d = rlvVar;
        this.h = abtrVar;
    }

    public final /* synthetic */ int a() {
        return 0;
    }

    public final void b(android.telecom.Call.Details details) {
        java.lang.String strB;
        jxb jxbVarA = jxa.a(details.getIntentExtras());
        if (jxbVarA != null) {
            if ((jxbVarA.t || jxbVarA.u) && (strB = defpackage.ura.b(details)) != null) {
                defpackage.abtr abtrVar = this.h;
                int i = true != jxbVarA.t ? 6 : 3;
                akzx akzxVarM = defpackage.usb.a.m();
                java.lang.String str = this.g;
                akzxVarM.u();
                defpackage.usb usbVar = (defpackage.usb) akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                usbVar.b |= 2;
                usbVar.d = str;
                int i2 = jxbVarA.v;
                akzxVarM.u();
                defpackage.usb usbVar2 = (defpackage.usb) akzxVarM.b;
                usbVar2.b |= 4;
                usbVar2.e = i2;
                int i3 = jxbVarA.w;
                akzxVarM.u();
                defpackage.usb usbVar3 = (defpackage.usb) akzxVarM.b;
                usbVar3.b |= 8;
                usbVar3.f = i3;
                int i4 = jxbVarA.x;
                akzxVarM.u();
                defpackage.usb usbVar4 = (defpackage.usb) akzxVarM.b;
                usbVar4.b |= 16;
                usbVar4.g = i4;
                abtrVar.u(i, strB, (defpackage.usb) akzxVarM.p());
                if (jxbVarA.t) {
                    agsm.i(938, ahrv.g(this.c.b(details.getCreationTimeMillis())).h(new icy(this, strB, details, 14, (byte[]) null), this.a), "fail to populate data into the history builder", new java.lang.Object[0]);
                }
            }
        }
    }

    @Override // defpackage.zoi
    public final void eh() {
        if (this.e.isPresent()) {
            agsm.i(939, ahrv.g(this.c.c()).h(new defpackage.uev(this, 11), this.a), "fail to get db version and launch feedback ", new java.lang.Object[0]);
        }
    }
}
