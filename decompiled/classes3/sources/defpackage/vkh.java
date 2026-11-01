package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vkh implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ vkh(lei leiVar, long j, java.util.concurrent.atomic.AtomicInteger atomicInteger, defpackage.akzb akzbVar, int i) {
        this.$cid = i;
        this.b = leiVar;
        this.a = j;
        this.d = atomicInteger;
        this.c = akzbVar;
    }

    public final ajcq a(java.lang.Object obj) {
        if (this.$cid == 0) {
            java.lang.String str = (java.lang.String) ((j$.util.Optional) obj).orElse((java.lang.Object) null);
            if (str == null || android.text.TextUtils.isEmpty(str)) {
                throw new defpackage.vki("mdn is empty");
            }
            long j = this.a;
            java.lang.Object obj2 = this.d;
            return ((defpackage.vkj) this.b).d((java.lang.String) this.c, "application/xml", j$.util.Optional.of(java.lang.String.format(java.util.Locale.US, "<?xml version=\"1.0\" encoding=\"UTF-8\"?><VMGVVMRequest>  <MessageHeader>    <transactionid>%1$s</transactionid>  </MessageHeader>  <MessageBody>    <mdn>%2$s</mdn>    <operation>%3$s</operation>    <source>Device</source>    <devicemodel>%4$s</devicemodel>  </MessageBody></VMGVVMRequest>", obj2, str, "retrieveSPGURL", android.os.Build.MODEL)), j);
        }
        lei leiVar = (lei) this.b;
        java.io.File file = new java.io.File(leiVar.b.getFilesDir(), "callscreenrecordings");
        file.mkdir();
        java.lang.String str2 = file.getAbsolutePath() + java.io.File.separator + "cs-" + this.a;
        akzx akzxVarM = idt.a.m();
        java.lang.String strConcat = str2.concat(".wav");
        akzxVarM.u();
        idt idtVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(strConcat);
        idtVar.b |= 1;
        idtVar.e = strConcat;
        akzx akzxVarM2 = ids.a.m();
        int i = ((java.util.concurrent.atomic.AtomicInteger) this.d).get();
        akzxVarM2.u();
        ids idsVar = akzxVarM2.b;
        idsVar.b |= 1;
        idsVar.c = i;
        akzxVarM2.u();
        ids idsVar2 = akzxVarM2.b;
        idsVar2.b |= 2;
        idsVar2.d = 1;
        akzxVarM2.u();
        ids idsVar3 = akzxVarM2.b;
        idsVar3.b |= 4;
        idsVar3.e = 2;
        akzxVarM.u();
        idt idtVar2 = akzxVarM.b;
        ids idsVarP = akzxVarM2.p();
        j$.util.Objects.requireNonNull(idsVarP);
        idtVar2.d = idsVarP;
        idtVar2.c = 3;
        return ahrv.g(leiVar.h.n(akzxVarM.p(), ((defpackage.akzb) this.c).b())).h(new lef(0), leiVar.c).e(java.lang.Throwable.class, new lef(2), leiVar.d);
    }

    public /* synthetic */ vkh(defpackage.vkj vkjVar, java.lang.String str, java.lang.String str2, long j, int i) {
        this.$cid = i;
        this.b = vkjVar;
        this.c = str;
        this.d = str2;
        this.a = j;
    }
}
