package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alia {
    public final java.lang.String a;
    public final aizh b;
    public final aizh c;
    public final aizh d;
    public final aify e;
    public final aigf f;

    public alia(java.lang.String str, aizh aizhVar, aizh aizhVar2, aizh aizhVar3, aify aifyVar, aigf aigfVar) {
        this.a = str;
        this.b = aizhVar;
        this.c = aizhVar2;
        this.d = aizhVar3;
        this.e = aifyVar;
        this.f = aigfVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.alia) {
            defpackage.alia aliaVar = (defpackage.alia) obj;
            if (this.a.equals(aliaVar.a) && this.b.equals(aliaVar.b) && this.c.equals(aliaVar.c) && this.d.equals(aliaVar.d) && ahvr.aP(this.e, aliaVar.e) && this.f.equals(aliaVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final java.lang.String toString() {
        aigf aigfVar = this.f;
        aify aifyVar = this.e;
        aizh aizhVar = this.d;
        aizh aizhVar2 = this.c;
        return "Feature{origText=" + this.a + ", inputWordIds=" + java.lang.String.valueOf(this.b) + ", inputMask=" + java.lang.String.valueOf(aizhVar2) + ", inputTypeIds=" + java.lang.String.valueOf(aizhVar) + ", origTokens=" + java.lang.String.valueOf(aifyVar) + ", tokenToOrigMap=" + java.lang.String.valueOf(aigfVar) + '}';
    }

    public alia() {
        throw null;
    }
}
