package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vdo {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/service/impl/database/VoicemailRepository");
    private static final java.lang.String[] j = {"_id", "source_data", "is_read", "deleted", "archived", "subscription_component_name", "subscription_id", "transcription", "has_content", "transcription_state"};
    public final android.content.Context b;
    public final defpackage.ojo c;
    public final defpackage.ajct d;
    public final defpackage.zjl e;
    public final defpackage.zjm f;
    public final defpackage.kgl g;
    public final defpackage.gpd h;
    public final defpackage.rsr i;
    private final defpackage.ajct k;
    private final defpackage.ajwr l = new defpackage.ajwr();

    public vdo(android.content.Context context, defpackage.ojo ojoVar, defpackage.rsr rsrVar, defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.zjm zjmVar, defpackage.gpd gpdVar, defpackage.zjl zjlVar, defpackage.kgl kglVar) {
        this.b = context;
        this.i = rsrVar;
        this.d = ajctVar;
        this.k = ajctVar2;
        this.f = zjmVar;
        this.c = ojoVar;
        this.h = gpdVar;
        this.e = zjlVar;
        this.g = kglVar;
    }

    private static android.content.ContentValues k(vdn vdnVar) {
        j$.util.Optional optionalOf;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        vdi vdiVar = new vdi(contentValues, 1);
        j$.util.Optional optional = vdnVar.a;
        if (true == optional.isPresent()) {
            ((android.content.ContentValues) vdiVar.a).put("has_content", (java.lang.Boolean) optional.get());
        }
        j$.util.Optional optional2 = vdnVar.b;
        vdi vdiVar2 = new vdi(contentValues, 0);
        if (true == optional2.isPresent()) {
            ((android.content.ContentValues) vdiVar2.a).put("mime_type", (java.lang.String) optional2.get());
        }
        j$.util.Optional optional3 = vdnVar.c;
        vdi vdiVar3 = new vdi(contentValues, 2);
        if (true == optional3.isPresent()) {
            java.lang.Object obj = optional3.get();
            ((android.content.ContentValues) vdiVar3.a).put("transcription", (java.lang.String) obj);
        }
        j$.util.Optional optional4 = vdnVar.d;
        vdi vdiVar4 = new vdi(contentValues, 3);
        if (true == optional4.isPresent()) {
            java.lang.Object obj2 = optional4.get();
            java.lang.Object obj3 = vdiVar4.a;
            switch (((uzm) obj2).ordinal()) {
                case 1:
                    optionalOf = j$.util.Optional.of(0);
                    break;
                case 2:
                    optionalOf = j$.util.Optional.of(1);
                    break;
                case 3:
                    optionalOf = j$.util.Optional.of(2);
                    break;
                case 4:
                    optionalOf = j$.util.Optional.of(3);
                    break;
                case 5:
                    optionalOf = j$.util.Optional.of(-1);
                    break;
                case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                    optionalOf = j$.util.Optional.of(-2);
                    break;
                case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                    optionalOf = j$.util.Optional.of(-3);
                    break;
                case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                    optionalOf = j$.util.Optional.of(-5);
                    break;
                case 9:
                    optionalOf = j$.util.Optional.of(-4);
                    break;
                case 10:
                    optionalOf = j$.util.Optional.of(-6);
                    break;
                default:
                    optionalOf = j$.util.Optional.empty();
                    break;
            }
            vdi vdiVar5 = new vdi(obj3, 6);
            if (true == optionalOf.isPresent()) {
                ((android.content.ContentValues) vdiVar5.a).put("transcription_state", (java.lang.Integer) optionalOf.get());
            }
        }
        vdnVar.e.isPresent();
        j$.util.Optional optional5 = vdnVar.f;
        vdi vdiVar6 = new vdi(contentValues, 4);
        if (true == optional5.isPresent()) {
            java.lang.Object obj4 = optional5.get();
            java.lang.Object obj5 = vdiVar6.a;
            ((java.lang.Boolean) obj4).booleanValue();
            ((android.content.ContentValues) obj5).put("is_read", (java.lang.Integer) 1);
        }
        vdnVar.g.isPresent();
        j$.util.Optional optional6 = vdnVar.h;
        vdi vdiVar7 = new vdi(contentValues, 5);
        if (true == optional6.isPresent()) {
            java.lang.Object obj6 = optional6.get();
            java.lang.Object obj7 = vdiVar7.a;
            ((java.lang.Boolean) obj6).booleanValue();
            ((android.content.ContentValues) obj7).put("dirty", (java.lang.Integer) 0);
        }
        return contentValues;
    }

    private static defpackage.rsr l(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.rsr rsrVar = new defpackage.rsr();
        rsrVar.aC(new defpackage.kaw("subscription_component_name").aI("IS", phoneAccountHandle.getComponentName().flattenToString()));
        rsrVar.aC(new defpackage.kaw("subscription_id").aI("IS", phoneAccountHandle.getId()));
        return rsrVar;
    }

    public final vdg a(android.database.Cursor cursor) {
        android.net.Uri uriBuildSourceUri = android.provider.VoicemailContract.Voicemails.buildSourceUri(this.b.getPackageName());
        vdf vdfVar = new vdf();
        vdfVar.i(android.content.ContentUris.withAppendedId(uriBuildSourceUri, cursor.getLong(0)));
        vdfVar.c(cursor.getLong(0));
        vdfVar.g((java.lang.String) j$.util.Optional.ofNullable(cursor.getString(1)).orElse(""));
        vdfVar.f(cursor.getInt(2) == 1);
        vdfVar.e(cursor.getInt(3) == 1);
        vdfVar.d(cursor.getInt(4) == 1);
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(cursor.getString(6));
        if (optionalOfNullable == null) {
            throw new java.lang.NullPointerException("Null phoneAccountId");
        }
        vdfVar.a = optionalOfNullable;
        j$.util.Optional optionalOfNullable2 = j$.util.Optional.ofNullable(cursor.getString(5));
        if (optionalOfNullable2 == null) {
            throw new java.lang.NullPointerException("Null phoneAccountComponentName");
        }
        vdfVar.b = optionalOfNullable2;
        vdfVar.h(j$.util.Optional.ofNullable(cursor.getString(7)));
        vdfVar.c = defpackage.afsq.bV(cursor.getInt(9));
        vdfVar.b(cursor.getInt(8) == 1);
        return vdfVar.a();
    }

    public final defpackage.ajcq b(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.rsr rsrVarL = l(phoneAccountHandle);
        rsrVarL.aC(new defpackage.kaw("archived").aI("=", 0));
        defpackage.rsr rsrVarAB = rsrVarL.aB();
        android.net.Uri uriBuildSourceUri = android.provider.VoicemailContract.Voicemails.buildSourceUri(this.b.getPackageName());
        java.lang.Object obj = rsrVarAB.b;
        java.lang.String[] strArr = (java.lang.String[]) rsrVarAB.a;
        return this.c.e(uriBuildSourceUri, (java.lang.String) obj, strArr);
    }

    public final defpackage.ajcq c(java.util.List list) {
        if (list.isEmpty()) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/voicemail/service/impl/database/VoicemailRepository", "deleteVoicemails", 505, "VoicemailRepository.java")).v("Requested deleting local voicemail with empty voicemail list");
            return defpackage.aiql.z(0);
        }
        j$.util.stream.Stream map = j$.util.Collection.-EL.stream(list).map(new var(3));
        j$.util.stream.Collector collector = defpackage.aido.a;
        defpackage.aify aifyVar = (defpackage.aify) map.collect(collector);
        defpackage.aify aifyVar2 = (defpackage.aify) j$.util.Collection.-EL.stream(list).map(new var(4)).map(new var(5)).collect(collector);
        defpackage.rsr rsrVar = new defpackage.rsr();
        rsrVar.aC(new defpackage.kaw("_id").aF(aifyVar2));
        defpackage.rsr rsrVarAB = rsrVar.aB();
        return defpackage.ahvr.I(this.c.e(android.provider.VoicemailContract.Voicemails.buildSourceUri(this.b.getPackageName()), (java.lang.String) rsrVarAB.b, (java.lang.String[]) rsrVarAB.a), new vcu(this, aifyVar, 5), this.d);
    }

    public final defpackage.ajcq d(vdl vdlVar) {
        return this.l.e(defpackage.ahqx.b(new vfm(this, vdlVar, 1)), this.d);
    }

    public final defpackage.ajcq e(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.rsr rsrVarAB = l(phoneAccountHandle).aB();
        android.net.Uri uriBuildSourceUri = android.provider.VoicemailContract.Voicemails.buildSourceUri(this.b.getPackageName());
        java.lang.Object obj = rsrVarAB.b;
        java.lang.Object obj2 = rsrVarAB.a;
        java.lang.String str = (java.lang.String) obj;
        return this.c.d(uriBuildSourceUri, j, str, (java.lang.String[]) obj2, null).c(defpackage.ahqx.e(new vdh(this, 2)), this.d).h();
    }

    public final defpackage.ajcq f(android.net.Uri uri) {
        return this.c.d(uri, j, null, null, null).c(defpackage.ahqx.e(new vdh(this, 0)), this.d).h();
    }

    public final defpackage.ajcq g(android.telecom.PhoneAccountHandle phoneAccountHandle, java.lang.String str) {
        defpackage.rsr rsrVarL = l(phoneAccountHandle);
        rsrVarL.aC(new defpackage.kaw("source_data").aI("=", str));
        defpackage.rsr rsrVarAB = rsrVarL.aB();
        android.net.Uri uriBuildSourceUri = android.provider.VoicemailContract.Voicemails.buildSourceUri(this.b.getPackageName());
        java.lang.Object obj = rsrVarAB.b;
        java.lang.Object obj2 = rsrVarAB.a;
        java.lang.String str2 = (java.lang.String) obj;
        return this.c.d(uriBuildSourceUri, j, str2, (java.lang.String[]) obj2, null).c(defpackage.ahqx.e(new vdh(this, 3)), this.d).h();
    }

    public final defpackage.ajcq h(android.net.Uri uri, vdn vdnVar) {
        android.content.ContentValues contentValuesK = k(vdnVar);
        if (contentValuesK.size() != 0) {
            return defpackage.ahvr.I(this.c.f(uri, contentValuesK, null, null), new vcu(this, vdnVar, 2), this.d);
        }
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l("com/android/dialer/voicemail/service/impl/database/VoicemailRepository", "update", (char) 214, "VoicemailRepository.java")).v("Requested updating local voicemail with no content");
        return defpackage.aiql.z(0);
    }

    public final defpackage.ajcq i(android.net.Uri uri, defpackage.akzc akzcVar, java.lang.String str) {
        vdm vdmVar = new vdm();
        j$.util.Optional optionalOf = j$.util.Optional.of(java.lang.Boolean.TRUE);
        if (optionalOf == null) {
            throw new java.lang.NullPointerException("Null hasAudioContent");
        }
        vdmVar.a = optionalOf;
        j$.util.Optional optionalOf2 = j$.util.Optional.of(str);
        if (optionalOf2 == null) {
            throw new java.lang.NullPointerException("Null mimeType");
        }
        vdmVar.b = optionalOf2;
        return defpackage.ahvr.O(new opo(this, uri, akzcVar, 8, (byte[]) null), this.k).i(new sue(this, uri, vdmVar.a(), 14, (byte[]) null), this.d);
    }

    public final defpackage.ajcq j(java.util.List list, vdn vdnVar) {
        if (list.isEmpty()) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l("com/android/dialer/voicemail/service/impl/database/VoicemailRepository", "updateVoicemails", (char) 250, "VoicemailRepository.java")).v("Requested updating local voicemail with empty ID list");
            return defpackage.aiql.z(0);
        }
        android.content.ContentValues contentValuesK = k(vdnVar);
        if (contentValuesK.size() != 0) {
            return defpackage.ahvr.M((java.lang.Iterable) j$.util.Collection.-EL.stream(list).map(new pgq(this, contentValuesK, 11)).collect(defpackage.aido.a)).h(new defpackage.vak(12), this.d);
        }
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l("com/android/dialer/voicemail/service/impl/database/VoicemailRepository", "updateVoicemails", (char) 260, "VoicemailRepository.java")).v("Requested updating local voicemail with no content");
        return defpackage.aiql.z(0);
    }
}
