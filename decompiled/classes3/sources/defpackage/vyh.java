package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vyh {
    public java.lang.Object a;
    public java.lang.Object b;
    public java.lang.Object c;
    public java.lang.Object d;
    public java.lang.Object e;
    public java.lang.Object f;

    public vyh(defpackage.vyj vyjVar) {
        this.b = j$.util.Optional.empty();
        this.d = j$.util.Optional.empty();
        this.e = j$.util.Optional.empty();
        this.a = vyjVar.a;
        this.b = vyjVar.b;
        this.c = vyjVar.c;
        this.d = vyjVar.d;
        this.e = vyjVar.e;
        this.f = vyjVar.f;
    }

    public final defpackage.vyj a() {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3 = this.a;
        if (obj3 != null && (obj = this.c) != null && (obj2 = this.f) != null) {
            return new defpackage.vyj((defpackage.uzo) obj3, (j$.util.Optional) this.b, (defpackage.vyi) obj, (j$.util.Optional) this.d, (j$.util.Optional) this.e, (defpackage.vxy) obj2);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a == null) {
            sb.append(" voicemailEntry");
        }
        if (this.c == null) {
            sb.append(" expandedState");
        }
        if (this.f == null) {
            sb.append(" groupPosition");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null selected");
        }
        this.d = optional;
    }

    public final void c(defpackage.uzo uzoVar) {
        if (uzoVar == null) {
            throw new java.lang.NullPointerException("Null voicemailEntry");
        }
        this.a = uzoVar;
    }

    public final defpackage.vps d() {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6 = this.a;
        if (obj6 != null && (obj = this.f) != null && (obj2 = this.e) != null && (obj3 = this.c) != null && (obj4 = this.d) != null && (obj5 = this.b) != null) {
            return new defpackage.vps((defpackage.absu) obj6, (defpackage.absu) obj, (aihd) obj2, (aify) obj3, (aihd) obj4, (aihd) obj5);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a == null) {
            sb.append(" activatedGreetingIdUpdateContent");
        }
        if (this.f == null) {
            sb.append(" voiceSignatureUpdateContent");
        }
        if (this.e == null) {
            sb.append(" customGreetingIdsToDelete");
        }
        if (this.c == null) {
            sb.append(" customGreetingsToInsert");
        }
        if (this.d == null) {
            sb.append(" customGreetingIdsToMarkAsDeleted");
        }
        if (this.b == null) {
            sb.append(" customGreetingIdsToMarkAsNotDeleted");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void e(aihd aihdVar) {
        if (aihdVar == null) {
            throw new java.lang.NullPointerException("Null customGreetingIdsToDelete");
        }
        this.e = aihdVar;
    }

    public final void f(aify aifyVar) {
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null customGreetingsToInsert");
        }
        this.c = aifyVar;
    }

    public vyh() {
        this.b = j$.util.Optional.empty();
        this.d = j$.util.Optional.empty();
        this.e = j$.util.Optional.empty();
    }

    public vyh(byte[] bArr) {
    }
}
