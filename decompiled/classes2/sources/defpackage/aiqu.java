package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aiqu extends aiqv {
    private final defpackage.aiqt c;

    public aiqu(aioj aiojVar, int i, defpackage.aiqt aiqtVar) {
        super(aiojVar, i);
        this.c = aiqtVar;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("%");
        aiojVar.f(sb);
        sb.append(true != aiojVar.d() ? 't' : 'T');
        sb.append(aiqtVar.G);
    }

    public final void a(aiqz aiqzVar, java.lang.Object obj) {
        defpackage.aiqt aiqtVar = this.c;
        if (!(obj instanceof java.util.Date) && !(obj instanceof java.util.Calendar) && !(obj instanceof java.lang.Long)) {
            aiqz.c(aiqzVar.d, obj, "%t" + aiqtVar.G);
            return;
        }
        aioj aiojVar = ((aiqv) this).b;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("%");
        aiojVar.f(sb);
        sb.append(true != aiojVar.d() ? 't' : 'T');
        sb.append(aiqtVar.G);
        aiqzVar.d.append(java.lang.String.format(aiop.a, sb.toString(), obj));
    }
}
