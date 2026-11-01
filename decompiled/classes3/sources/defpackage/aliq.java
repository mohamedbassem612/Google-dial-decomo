package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aliq {
    public java.lang.Object a;
    public java.lang.Object b;
    public java.lang.Object c;

    public aliq(defpackage.alid alidVar) {
        this.a = alidVar.a;
        this.c = alidVar.b;
        this.b = alidVar.c;
    }

    public final void A(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null objectId");
        }
        this.c = str;
    }

    public final defpackage.alir a() {
        java.lang.Object obj;
        java.lang.Object obj2 = this.a;
        if (obj2 != null && (obj = this.c) != null) {
            return new defpackage.alir((aify) obj2, (j$.util.Optional) this.b, (aify) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a == null) {
            sb.append(" outboundEvents");
        }
        if (this.c == null) {
            sb.append(" recognitionEventLogs");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(alio alioVar) {
        this.b = j$.util.Optional.of(alioVar);
    }

    public final void c(aify aifyVar) {
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null outboundEvents");
        }
        this.a = aifyVar;
    }

    public final void d(aify aifyVar) {
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null recognitionEventLogs");
        }
        this.c = aifyVar;
    }

    public final defpackage.alid e() {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3 = this.a;
        if (obj3 != null && (obj = this.c) != null && (obj2 = this.b) != null) {
            return new defpackage.alid((aiga) obj3, (amas) obj, (amaw) obj2);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a == null) {
            sb.append(" predictedHeads");
        }
        if (this.c == null) {
            sb.append(" modelInput");
        }
        if (this.b == null) {
            sb.append(" modelOutput");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void f(amas amasVar) {
        if (amasVar == null) {
            throw new java.lang.NullPointerException("Null modelInput");
        }
        this.c = amasVar;
    }

    public final void g(amaw amawVar) {
        if (amawVar == null) {
            throw new java.lang.NullPointerException("Null modelOutput");
        }
        this.b = amawVar;
    }

    public final afjj h() {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3 = this.b;
        if (obj3 != null && (obj = this.c) != null && (obj2 = this.a) != null) {
            return new afjj((java.lang.String) obj3, (java.lang.String) obj, (defpackage.afjk) obj2);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.b == null) {
            sb.append(" sessionId");
        }
        if (this.c == null) {
            sb.append(" triggerId");
        }
        if (this.a == null) {
            sb.append(" surveyStyle");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void i(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null sessionId");
        }
        this.b = str;
    }

    public final void j(defpackage.afjk afjkVar) {
        if (afjkVar == null) {
            throw new java.lang.NullPointerException("Null surveyStyle");
        }
        this.a = afjkVar;
    }

    public final void k(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null triggerId");
        }
        this.c = str;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [aehm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [ahyc, java.lang.Object] */
    public final defpackage.aejo l() {
        ?? r1;
        ahvr.bZ(this.b != null, "Either setAvatarRetriever or setAvatarImageLoader have to be called.");
        ?? r0 = this.a;
        if (r0 != 0 && (r1 = this.c) != 0) {
            return new defpackage.aejo(r0, (defpackage.wsk) this.b, r1);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a == null) {
            sb.append(" accountConverter");
        }
        if (this.c == null) {
            sb.append(" onAddAccount");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @java.lang.Deprecated
    public final void m(android.view.View.OnClickListener onClickListener) {
        this.c = new defpackage.adek(onClickListener, 8);
    }

    public final defpackage.acuo n() {
        java.lang.Object obj = this.a;
        if (obj == null) {
            throw new java.lang.IllegalStateException("Missing required properties: dataFileGroup");
        }
        return new defpackage.acuo((acux) obj, (ahyn) this.b, (ahyn) this.c);
    }

    public final void o(acux acuxVar) {
        if (acuxVar == null) {
            throw new java.lang.NullPointerException("Null dataFileGroup");
        }
        this.a = acuxVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ymd] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, yml] */
    public final defpackage.yot p() {
        ?? r1;
        java.lang.Object obj;
        ?? r0 = this.b;
        if (r0 != 0 && (r1 = this.a) != 0 && (obj = this.c) != null) {
            return new defpackage.yot(r0, r1, (defpackage.ymk) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.b == null) {
            sb.append(" aiCoreClient");
        }
        if (this.a == null) {
            sb.append(" downloadCallback");
        }
        if (this.c == null) {
            sb.append(" feature");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void q(defpackage.ymk ymkVar) {
        if (ymkVar == null) {
            throw new java.lang.NullPointerException("Null feature");
        }
        this.c = ymkVar;
    }

    public final void r(java.util.Map map) {
        this.b = aigf.i(map);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ymd] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, yml] */
    public final defpackage.ynr s() {
        ?? r1;
        java.lang.Object obj;
        ?? r0 = this.b;
        if (r0 != 0 && (r1 = this.a) != 0 && (obj = this.c) != null) {
            return new defpackage.ynr(r0, r1, (defpackage.ymk) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.b == null) {
            sb.append(" aiCoreClient");
        }
        if (this.a == null) {
            sb.append(" downloadCallback");
        }
        if (this.c == null) {
            sb.append(" feature");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void t(defpackage.ymk ymkVar) {
        if (ymkVar == null) {
            throw new java.lang.NullPointerException("Null feature");
        }
        this.c = ymkVar;
    }

    public final boolean u() {
        return this.a != null;
    }

    public final com.android.voicemail.impl.sms.VvmMessage v() {
        java.lang.Object obj = this.a;
        if (obj == null) {
            throw new java.lang.IllegalStateException("Missing required properties: phoneAccountHandle");
        }
        return new com.android.voicemail.impl.sms.AutoValue_VvmMessage((android.telecom.PhoneAccountHandle) obj, (java.lang.String) this.c, (android.os.Bundle) this.b);
    }

    public final void w(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        if (phoneAccountHandle == null) {
            throw new java.lang.NullPointerException("Null phoneAccountHandle");
        }
        this.a = phoneAccountHandle;
    }

    public final defpackage.vpr x() {
        java.lang.Object obj;
        java.lang.Object obj2 = this.c;
        if (obj2 != null && (obj = this.a) != null) {
            return new defpackage.vpr((java.lang.String) obj2, (java.lang.String) obj, (j$.util.OptionalLong) this.b);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.c == null) {
            sb.append(" objectId");
        }
        if (this.a == null) {
            sb.append(" audioUrl");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void y(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null audioUrl");
        }
        this.a = str;
    }

    public final void z(j$.util.OptionalLong optionalLong) {
        if (optionalLong == null) {
            throw new java.lang.NullPointerException("Null durationSeconds");
        }
        this.b = optionalLong;
    }

    public aliq(byte[] bArr) {
    }

    public aliq(char[] cArr, byte[] bArr) {
        ahwt ahwtVar = ahwt.a;
        this.b = ahwtVar;
        this.c = ahwtVar;
    }

    public aliq() {
        this.b = j$.util.Optional.empty();
    }

    public aliq(byte[] bArr, char[] cArr, byte[] bArr2) {
        this.b = j$.util.OptionalLong.empty();
    }

    public aliq(abrp abrpVar) {
        this.c = new java.lang.ref.WeakReference(abrpVar);
    }
}
