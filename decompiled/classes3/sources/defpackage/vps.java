package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vps {
    public final aihd a;
    public final aify b;
    public final aihd c;
    public final aihd d;
    public final defpackage.absu e;
    public final defpackage.absu f;

    public vps(defpackage.absu absuVar, defpackage.absu absuVar2, aihd aihdVar, aify aifyVar, aihd aihdVar2, aihd aihdVar3) {
        this.e = absuVar;
        this.f = absuVar2;
        this.a = aihdVar;
        this.b = aifyVar;
        this.c = aihdVar2;
        this.d = aihdVar3;
    }

    public static defpackage.vyh a() {
        defpackage.vyh vyhVar = new defpackage.vyh((byte[]) null);
        vyhVar.a = defpackage.absu.a();
        vyhVar.f = defpackage.absu.a();
        aikn aiknVar = aikn.a;
        vyhVar.e(aiknVar);
        vyhVar.f(aike.a);
        if (aiknVar == null) {
            throw new java.lang.NullPointerException("Null customGreetingIdsToMarkAsDeleted");
        }
        vyhVar.d = aiknVar;
        vyhVar.b = aiknVar;
        return vyhVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vps) {
            defpackage.vps vpsVar = (defpackage.vps) obj;
            if (this.e.equals(vpsVar.e) && this.f.equals(vpsVar.f) && this.a.equals(vpsVar.a) && ahvr.aP(this.b, vpsVar.b) && this.c.equals(vpsVar.c) && this.d.equals(vpsVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.e.hashCode() ^ 1000003) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.c) * 1000003) ^ this.d.c;
    }

    public final java.lang.String toString() {
        aihd aihdVar = this.d;
        aihd aihdVar2 = this.c;
        aify aifyVar = this.b;
        aihd aihdVar3 = this.a;
        defpackage.absu absuVar = this.f;
        return "VoicemailGreetingsUpdateContent{activatedGreetingIdUpdateContent=" + java.lang.String.valueOf(this.e) + ", voiceSignatureUpdateContent=" + java.lang.String.valueOf(absuVar) + ", customGreetingIdsToDelete=" + java.lang.String.valueOf(aihdVar3) + ", customGreetingsToInsert=" + java.lang.String.valueOf(aifyVar) + ", customGreetingIdsToMarkAsDeleted=" + java.lang.String.valueOf(aihdVar2) + ", customGreetingIdsToMarkAsNotDeleted=" + java.lang.String.valueOf(aihdVar) + '}';
    }

    public vps() {
        throw null;
    }
}
