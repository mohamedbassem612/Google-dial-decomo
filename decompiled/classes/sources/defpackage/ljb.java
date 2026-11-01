package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ljb implements defpackage.adrk {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/callscreen/impl/speechrecognition/SodaSpeechRecognizer");
    public static final java.lang.String b = defpackage.akff.p.q;
    public static final java.lang.String c = defpackage.akff.l.q;
    public android.speech.SpeechRecognizer d;
    public final android.content.Context e;
    public final defpackage.ajct f;
    public final java.util.concurrent.Executor i;
    public final defpackage.lbw j;
    public final defpackage.ajct k;
    public final defpackage.ajct l;
    public final defpackage.lht m;
    public android.net.Uri n;
    public int o;
    public android.os.ParcelFileDescriptor[] p;
    public java.nio.channels.FileChannel q;
    public adrn r;
    public byte[] s;
    public int t;
    public final java.lang.Object u = new java.lang.Object();
    public volatile boolean v = false;
    public final defpackage.adsb g = new defpackage.adsb();
    public final defpackage.lja h = new defpackage.lja(this);

    public ljb(android.content.Context context, defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.ajct ajctVar3, defpackage.ajct ajctVar4, defpackage.lbw lbwVar, defpackage.lht lhtVar) {
        this.e = context;
        this.f = ajctVar;
        this.i = new defpackage.ajdc(ajctVar2);
        this.j = lbwVar;
        this.k = ajctVar3;
        this.l = ajctVar4;
        this.m = lhtVar;
    }

    public final java.lang.String a() {
        return defpackage.gus.ae(this.e).toLanguageTag().equals(java.util.Locale.JAPAN.toLanguageTag()) ? c : b;
    }

    @Override // defpackage.adrk
    public final void b(byte[] bArr) {
        synchronized (this.u) {
            int i = this.t;
            int length = bArr.length;
            int i2 = i + length;
            byte[] bArrCopyOf = this.s;
            int length2 = bArrCopyOf.length;
            if (i2 > length2) {
                bArrCopyOf = java.util.Arrays.copyOf(this.s, java.lang.Math.max(i2, length2 << 1));
                this.s = bArrCopyOf;
            }
            java.lang.System.arraycopy(bArr, 0, bArrCopyOf, this.t, length);
            this.t += length;
        }
    }
}
