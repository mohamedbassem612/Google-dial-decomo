package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class agqy implements defpackage.xuq {
    private final /* synthetic */ int $cid;

    @Override // defpackage.xuq
    public final void a(byte[] bArr, java.lang.Object obj, java.security.MessageDigest messageDigest) {
        if (this.$cid == 0) {
            defpackage.xur xurVar = defpackage.agqz.a;
            int iA = ((com.google.apps.tiktok.account.AccountId) obj).a();
            messageDigest.update(new byte[]{(byte) iA, (byte) (iA >> 8), (byte) (iA >> 16), (byte) (iA >> 24)});
        } else {
            defpackage.xur xurVar2 = defpackage.abyv.a;
            if (((java.lang.Boolean) obj).booleanValue()) {
                messageDigest.update(bArr);
            }
        }
    }
}
