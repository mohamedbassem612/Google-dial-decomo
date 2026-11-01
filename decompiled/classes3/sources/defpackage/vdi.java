package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vdi implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ vdi(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        j$.util.Optional optionalOf;
        switch (this.$cid) {
            case 0:
                aimz aimzVar = vdo.a;
                ((android.content.ContentValues) this.a).put("mime_type", (java.lang.String) obj);
                break;
            case 1:
                aimz aimzVar2 = vdo.a;
                ((android.content.ContentValues) this.a).put("has_content", (java.lang.Boolean) obj);
                break;
            case 2:
                aimz aimzVar3 = vdo.a;
                ((android.content.ContentValues) this.a).put("transcription", (java.lang.String) obj);
                break;
            case 3:
                aimz aimzVar4 = vdo.a;
                switch (((defpackage.uzm) obj).ordinal()) {
                    case 1:
                        optionalOf = j$.util.Optional.of(0);
                        break;
                    case 2:
                        optionalOf = j$.util.Optional.of(1);
                        break;
                    case 3:
                        optionalOf = j$.util.Optional.of(2);
                        break;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                        optionalOf = j$.util.Optional.of(3);
                        break;
                    case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                        optionalOf = j$.util.Optional.of(-1);
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                        optionalOf = j$.util.Optional.of(-2);
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                        optionalOf = j$.util.Optional.of(-3);
                        break;
                    case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                        optionalOf = j$.util.Optional.of(-5);
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                        optionalOf = j$.util.Optional.of(-4);
                        break;
                    case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                        optionalOf = j$.util.Optional.of(-6);
                        break;
                    default:
                        optionalOf = j$.util.Optional.empty();
                        break;
                }
                defpackage.vdi vdiVar = new defpackage.vdi(this.a, 6);
                if (true == optionalOf.isPresent()) {
                    ((android.content.ContentValues) vdiVar.a).put("transcription_state", (java.lang.Integer) optionalOf.get());
                }
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                aimz aimzVar5 = vdo.a;
                ((android.content.ContentValues) this.a).put("is_read", java.lang.Integer.valueOf(((java.lang.Boolean) obj).booleanValue() ? 1 : 0));
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                aimz aimzVar6 = vdo.a;
                ((android.content.ContentValues) this.a).put("dirty", java.lang.Integer.valueOf(((java.lang.Boolean) obj).booleanValue() ? 1 : 0));
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aimz aimzVar7 = vdo.a;
                ((android.content.ContentValues) this.a).put("transcription_state", (java.lang.Integer) obj);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                aimz aimzVar8 = vdo.a;
                ((android.content.ContentValues) this.a).put("transcription", (java.lang.String) obj);
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                vew.a.b().l("com/android/dialer/voicemail/service/impl/sms/VvmSmsDispatcherImpl", "removeSmsListenerInternal", 184, "VvmSmsDispatcherImpl.java").w("remove sms listener: %d", java.lang.System.identityHashCode((defpackage.vev) obj));
                ((vew) this.a).e = j$.util.Optional.empty();
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                ((aihb) this.a).i((defpackage.whl) obj);
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                agsm.i(984, ((vee) obj).j((android.telecom.PhoneAccountHandle) this.a), "Failure scheduling VVM update status from RestVvmCarrierService#changePin", new java.lang.Object[0]);
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                agsm.i(983, ((vee) obj).i((android.telecom.PhoneAccountHandle) this.a), "Failure scheduling VVM Sync from RestVvmCarrierService#activate", new java.lang.Object[0]);
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                agsm.i(985, ((vee) obj).g((android.telecom.PhoneAccountHandle) this.a), "Failure scheduling VVM Activation from RestVvmCarrierService#updateStatus", new java.lang.Object[0]);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                defpackage.vpc vpcVar = (defpackage.vpc) this.a;
                vpcVar.k.R(true);
                vpcVar.k.k(false);
                com.android.dialer.common.preference.SwitchPreferenceWithClickableSummaryCompat switchPreferenceWithClickableSummaryCompat = vpcVar.k;
                boolean zBooleanValue = ((java.lang.Boolean) vpcVar.w.a()).booleanValue();
                android.content.Context context = vpcVar.p;
                switchPreferenceWithClickableSummaryCompat.p(new defpackage.akwb(context, zBooleanValue).d((java.lang.String) obj, context.getString(2132018781), context.getString(2132020940)));
                vpcVar.k.I(false);
                com.android.dialer.common.preference.SwitchPreferenceWithClickableSummaryCompat switchPreferenceWithClickableSummaryCompat2 = vpcVar.k;
                if (((androidx.preference.Preference) switchPreferenceWithClickableSummaryCompat2).z) {
                    ((androidx.preference.Preference) switchPreferenceWithClickableSummaryCompat2).z = false;
                    switchPreferenceWithClickableSummaryCompat2.d();
                }
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                ((vcc) obj).j((android.telecom.PhoneAccountHandle) this.a, j$.util.Optional.ofNullable((java.lang.Object) null));
                break;
            case 15:
                defpackage.vuc vucVar = (defpackage.vuc) obj;
                akzx akzxVar = (akzx) this.a;
                akzxVar.u();
                defpackage.vtu vtuVar = (defpackage.vtu) akzxVar.b;
                defpackage.vtu vtuVar2 = defpackage.vtu.a;
                j$.util.Objects.requireNonNull(vucVar);
                vtuVar.g = vucVar;
                vtuVar.b |= 8;
                break;
            case 16:
                defpackage.vtx vtxVar = (defpackage.vtx) obj;
                akzx akzxVar2 = (akzx) this.a;
                akzxVar2.u();
                defpackage.vtu vtuVar3 = (defpackage.vtu) akzxVar2.b;
                defpackage.vtu vtuVar4 = defpackage.vtu.a;
                j$.util.Objects.requireNonNull(vtxVar);
                vtuVar3.f = vtxVar;
                vtuVar3.b |= 4;
                break;
            case 17:
                defpackage.vtt vttVar = (defpackage.vtt) obj;
                akzx akzxVar3 = (akzx) this.a;
                akzxVar3.u();
                defpackage.vts vtsVar = (defpackage.vts) akzxVar3.b;
                defpackage.vts vtsVar2 = defpackage.vts.a;
                j$.util.Objects.requireNonNull(vttVar);
                vtsVar.d = vttVar;
                vtsVar.b |= 1;
                break;
            case 18:
                defpackage.vtx vtxVar2 = (defpackage.vtx) obj;
                akzx akzxVar4 = (akzx) this.a;
                akzxVar4.u();
                defpackage.vts vtsVar3 = (defpackage.vts) akzxVar4.b;
                defpackage.vts vtsVar4 = defpackage.vts.a;
                j$.util.Objects.requireNonNull(vtxVar2);
                vtsVar3.f = vtxVar2;
                vtsVar3.b |= 2;
                break;
            case 19:
                defpackage.vtt vttVar2 = (defpackage.vtt) obj;
                java.lang.String[] strArr = vva.a;
                rsr rsrVarAI = new kaw("source_package").aI("=", vttVar2.c);
                rsr rsrVar = (rsr) this.a;
                rsrVar.aC(rsrVarAI);
                if ((vttVar2.b & 2) != 0) {
                    defpackage.vtq vtqVar = vttVar2.d;
                    if (vtqVar == null) {
                        vtqVar = defpackage.vtq.a;
                    }
                    android.telecom.PhoneAccountHandle phoneAccountHandleAt = wsc.at(vtqVar);
                    rsrVar.aC(new kaw("subscription_component_name").aI("IS", phoneAccountHandleAt.getComponentName().flattenToString()));
                    rsrVar.aC(new kaw("subscription_id").aI("IS", phoneAccountHandleAt.getId()));
                }
                break;
            default:
                akzx akzxVar5 = (akzx) this.a;
                akzxVar5.u();
                defpackage.vts vtsVar5 = (defpackage.vts) akzxVar5.b;
                defpackage.vts vtsVar6 = defpackage.vts.a;
                vtsVar5.e = albq.a;
                akzxVar5.aa((aify) obj);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
