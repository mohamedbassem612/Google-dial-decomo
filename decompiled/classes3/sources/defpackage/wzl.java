package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wzl extends defpackage.ahao {
    @Override // defpackage.ahao
    public final android.view.View a(android.view.ViewGroup viewGroup) {
        return android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624285, viewGroup, false);
    }

    @Override // defpackage.ahao
    public final /* bridge */ /* synthetic */ void b(android.view.View view, java.lang.Object obj) {
        defpackage.uva uvaVar = (defpackage.uva) obj;
        ahvr.bM(uvaVar.c == 4);
        ((android.widget.TextView) view.findViewById(2131428021)).setText((uvaVar.c == 4 ? (defpackage.utz) uvaVar.d : defpackage.utz.a).c);
    }
}
