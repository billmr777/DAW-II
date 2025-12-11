> O servidor DNS traduce nomes de dominio en enderezos IP.

![](https://learn.microsoft.com/es-es/azure/sentinel/media/normalization/dns-request-flow.png)

## Características principais
- Resolve nomes mediante rexistros **A**, **CNAME**, **MX**, etc.
- É fundamental no [[Despregamento de aplicacións web]].
- Utilizado en calquera arquitectura de rede.

## Exemplos de implementación
| **Software**  | **Sistema** |
| ------------- | ----------- |
| Bind9         | Linux       |
| Microsoft DNS | Windows     |

## Recursos recomendados
- [Documentación oficial DNS](https://bind9.readthedocs.io)
- Videotutorial: https://youtu.be/6b0N9NDTt0c

#dns #rede

## Relacións
- Fundamental para o [[Servidor de aplicacións]] e para o [[Despregamento de aplicacións web]].

#dns #rede
