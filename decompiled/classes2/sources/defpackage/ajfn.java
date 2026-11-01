package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ajfn implements ajlq {
    private final /* synthetic */ int $cid;

    public final aiql a(ajsz ajszVar, java.lang.Integer num) throws java.security.GeneralSecurityException {
        switch (this.$cid) {
            case 0:
                ajgc ajgcVar = (ajgc) ajszVar;
                ajel ajelVar = defpackage.ajft.a;
                if (!ajsz.u(2)) {
                    throw new java.security.GeneralSecurityException("Cannot use AES-CTR-HMAC in FIPS-mode");
                }
                return aftt.W(ajgcVar, ajyi.A(ajgcVar.a), ajyi.A(ajgcVar.b), num);
            case 1:
                ajgh ajghVar = (ajgh) ajszVar;
                ajel ajelVar2 = defpackage.ajft.a;
                if (ajsz.u(1)) {
                    return aftt.V(ajghVar, ajyi.A(ajghVar.a), num);
                }
                throw new java.security.GeneralSecurityException("Cannot use AES-EAX in FIPS-mode");
            case 2:
                ajgu ajguVar = (ajgu) ajszVar;
                ajel ajelVar3 = defpackage.ajft.a;
                if (ajsz.u(1)) {
                    return ajgr.aq(ajguVar.a, ajyi.A(32), num);
                }
                throw new java.security.GeneralSecurityException("Cannot use ChaCha20Poly1305 in FIPS-mode");
            case 3:
                ajhu ajhuVar = (ajhu) ajszVar;
                ajel ajelVar4 = defpackage.ajft.a;
                if (ajsz.u(1)) {
                    return ajhr.aq(ajhuVar.a, ajyi.A(32), num);
                }
                throw new java.security.GeneralSecurityException("Cannot use XChaCha20Poly1305 in FIPS-mode");
            case 4:
                ajhq ajhqVar = (ajhq) ajszVar;
                ajel ajelVar5 = defpackage.ajft.a;
                if (ajsz.u(1)) {
                    return ajhn.aq(ajhqVar, ajyi.A(32), num);
                }
                throw new java.security.GeneralSecurityException("Cannot use XAesGcm in FIPS-mode");
            case 5:
                ajgm ajgmVar = (ajgm) ajszVar;
                ajel ajelVar6 = defpackage.ajft.a;
                if (ajsz.u(2)) {
                    return aftt.U(ajgmVar, ajyi.A(ajgmVar.a), num);
                }
                throw new java.security.GeneralSecurityException("Cannot use AES-GCM in FIPS-mode");
            case 6:
                ajgq ajgqVar = (ajgq) ajszVar;
                ajel ajelVar7 = defpackage.ajft.a;
                if (ajsz.u(1)) {
                    return aftt.T(ajgqVar, ajyi.A(ajgqVar.a), num);
                }
                throw new java.security.GeneralSecurityException("Cannot use AES-GCM-SIV in FIPS-mode");
            case 7:
                return aftt.N((ajjj) ajszVar, num);
            case 8:
                return aftt.M((ajjr) ajszVar, num);
            case 9:
                defpackage.ajqs ajqsVar = (defpackage.ajqs) ajszVar;
                ajmo ajmoVar = defpackage.ajqp.a;
                return defpackage.ajqo.ap(ajqsVar, ajyi.A(ajqsVar.f()));
            case 10:
                defpackage.ajqy ajqyVar = (defpackage.ajqy) ajszVar;
                ajmo ajmoVar2 = defpackage.ajqv.a;
                return defpackage.ajqt.ap(ajqyVar, ajyi.A(ajqyVar.e()));
            case 11:
                defpackage.ajqy ajqyVar2 = (defpackage.ajqy) ajszVar;
                int i = defpackage.ajrb.a;
                if (num == null) {
                    return defpackage.ajqt.ap(ajqyVar2, ajyi.A(ajqyVar2.e()));
                }
                throw new java.security.GeneralSecurityException("idRequirement must be null");
            default:
                defpackage.ajqs ajqsVar2 = (defpackage.ajqs) ajszVar;
                int i2 = defpackage.ajrb.a;
                if (num == null) {
                    return defpackage.ajqo.ap(ajqsVar2, ajyi.A(ajqsVar2.f()));
                }
                throw new java.security.GeneralSecurityException("idRequirement must be null");
        }
    }
}
